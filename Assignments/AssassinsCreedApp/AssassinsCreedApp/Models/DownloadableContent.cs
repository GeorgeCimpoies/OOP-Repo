namespace AssassinsCreedApp.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("DownloadableContent")]
    public partial class DownloadableContent
    {
        [Key]
        [Column(Order = 0)]
        public int DownloadableContentId { get; set; }

        [Key]
        [Column(Order = 1)]
        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int GameId { get; set; }

        [Required]
        [StringLength(50)]
        public string DLC { get; set; }

        public virtual Game Game { get; set; }
    }
}
