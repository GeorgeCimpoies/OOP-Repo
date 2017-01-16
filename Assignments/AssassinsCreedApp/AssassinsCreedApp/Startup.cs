using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(AssassinsCreedApp.Startup))]
namespace AssassinsCreedApp
{
    public partial class Startup
    {
        public void Configuration(IAppBuilder app)
        {
            ConfigureAuth(app);
        }
    }
}
