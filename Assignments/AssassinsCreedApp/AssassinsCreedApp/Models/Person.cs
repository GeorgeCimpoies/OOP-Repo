namespace AssassinsCreedApp.Models
{
    using System;
    using System.Collections.Generic;
    using System.ComponentModel.DataAnnotations;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Data.Entity.Spatial;

    [Table("Person")]
    public partial class Person
    {
        [Key]
        [Column(Order = 0)]
        public int PersonId { get; set; }

        [Key]
        [Column(Order = 1)]
        [DatabaseGenerated(DatabaseGeneratedOption.None)]
        public int AddressId { get; set; }

        public int PersonTypeId { get; set; }

        [StringLength(50)]
        public string DateOfBirth { get; set; }

        [Required]
        [StringLength(50)]
        public string Name { get; set; }

        public virtual Address Address { get; set; }

        public virtual PersonType PersonType { get; set; }
    }
}
