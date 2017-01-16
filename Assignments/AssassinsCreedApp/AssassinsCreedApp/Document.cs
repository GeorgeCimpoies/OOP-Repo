namespace AssassinsCreedApp
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Document")]
    public partial class Document
    {
        public int DocumentId { get; set; }

        public int GameId { get; set; }

        [Required]
        [StringLength(50)]
        public string DocumentName { get; set; }

        [Required]
        [StringLength(100)]
        public string DocumentDescription { get; set; }

        public virtual Game Game { get; set; }
    }
}
