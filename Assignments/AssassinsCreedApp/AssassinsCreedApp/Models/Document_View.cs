namespace AssassinsCreedApp.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Document View")]
    public partial class Document_View
    {
        [Key]
        [Column(Order = 0)]
        [StringLength(50)]
        public string DocumentName { get; set; }

        [Key]
        [Column(Order = 1)]
        [StringLength(100)]
        public string DocumentDescription { get; set; }

        [Key]
        [Column(Order = 2)]
        [StringLength(50)]
        public string GameName { get; set; }
    }
}
