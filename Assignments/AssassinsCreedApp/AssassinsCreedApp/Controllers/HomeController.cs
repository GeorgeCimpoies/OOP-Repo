using System;
using System.Linq;
using System.Web.Mvc;
using AssassinsCreedApp.Models;
using System.Data.Entity;
using System.Net;
using System.Net.Mail;
using System.Collections.Generic;

namespace AssassinsCreedApp.Controllers
{
    public class HomeController : Controller
    {
        private AssassinsCreedDBModel _db = new AssassinsCreedDBModel();

        // GET: Home
        public ActionResult Index()
        {
            var games = _db.Games.Include(a => a.GameName).Include(a => a.GameDescription)

        .OrderBy(a => a.ReleaseDate);

            return View(_db.Games.ToList());
        }

        [HttpPost]
        public ActionResult Index(ContactViewModel vm)
        {
            if (ModelState.IsValid)
            {
                try
                {
                    MailMessage msz = new MailMessage();
                    msz.From = new MailAddress(vm.Email);//Email which you are getting 
                                                         //from contact us page 
                    msz.To.Add("emailaddrss@gmail.com");//Where mail will be sent 
                    msz.Subject = vm.Subject;
                    msz.Body = vm.Message;
                    SmtpClient smtp = new SmtpClient();

                    smtp.Host = "smtp.gmail.com";

                    smtp.Port = 587;

                    smtp.Credentials = new System.Net.NetworkCredential
                    ("youremailid@gmail.com", "password");

                    smtp.EnableSsl = true;

                    smtp.Send(msz);

                    ModelState.Clear();
                    ViewBag.Message = "Thank you for Contacting us ";
                }
                catch (Exception ex)
                {
                    ModelState.Clear();
                    ViewBag.Message = $" Sorry we are facing Problem here {ex.Message}";
                }
            }

            return View();
        }
        public ActionResult Error()
        {
            return View();
        }


        // GET: Home/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }

            Game game = _db.Games.Find(id);


            List<Developer> developers = _db.Developers.Where(d => d.Games.Any(g => g.GameId == id)).ToList();

            if (game == null)
            {
                return HttpNotFound();
            }
            return View(game);
        }

        // GET: Home/Create
        public ActionResult Create()
        {
            ViewBag.PublisherId = new SelectList(_db.Publishers, "PublisherId", "PublisherName");
            var game = new Game();
            return View(game.Publisher);
        }

        // POST: Home/Create
        [HttpPost]
        public ActionResult Create(Game gameToCreate)
        {

            if (ModelState.IsValid)

            {

                _db.Games.Add(gameToCreate);

                _db.SaveChanges();

                return RedirectToAction("Index");

            }

            ViewBag.PublisherId = new SelectList(_db.Publishers, "PublisherId", "PublisherName",

                gameToCreate.PublisherId);

            return View(gameToCreate);
        }

        // GET: Home/Edit/5
        public ActionResult Edit(int id)
        {
            ViewBag.PublisherId = new SelectList(_db.Publishers, "PublisherId", "PublisherName");
            var gameToEdit = (from m in _db.Games

                               where m.GameId == id

                               select m).First();

            return View(gameToEdit);
        }

        // POST: Home/Edit/5
        [HttpPost]
        public ActionResult Edit([Bind(Include = "GameId,GameName,ReleaseDate,GameDescription,PublisherId,PublisherName")]Game gameToEdit)
        {

            var originalGame = (from m in _db.Games

                                 where m.GameId == gameToEdit.GameId

                                 select m).First();

            if (!ModelState.IsValid)

                return View(originalGame);

            originalGame.GameName = gameToEdit.GameName;
            originalGame.GameDescription = gameToEdit.GameDescription;
            originalGame.ReleaseDate = gameToEdit.ReleaseDate;
            originalGame.PublisherId = gameToEdit.PublisherId;
           

            _db.SaveChanges();

            return RedirectToAction("Index");
           
        }

        // GET: Home/Delete/5
        public ActionResult Delete(int? id)
        {

            if (id == null)
            {
                return new HttpStatusCodeResult(HttpStatusCode.BadRequest);
            }
            Game game = _db.Games.Find(id);
            if (game == null)
            {
                return HttpNotFound();
            }
            return View(game);
        }

        // POST: Home/Delete/5
        [HttpPost]
        public ActionResult Delete(int id, FormCollection collection)
        {
            Game game = _db.Games.Find(id);
            _db.Games.Remove(game);
            _db.SaveChanges();
            return RedirectToAction("Index");
        }
    }
}
