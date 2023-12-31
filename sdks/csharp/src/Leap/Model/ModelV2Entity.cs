/*
 * Leap
 *
 * The Official Leap API
 *
 * The version of the OpenAPI document: 1.0
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Leap.Client.OpenAPIDateConverter;

namespace Leap.Model
{
    /// <summary>
    /// ModelV2Entity
    /// </summary>
    [DataContract(Name = "ModelV2Entity")]
    public partial class ModelV2Entity : IEquatable<ModelV2Entity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelV2Entity" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModelV2Entity() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModelV2Entity" /> class.
        /// </summary>
        /// <param name="id">id (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="createdAt">createdAt (required).</param>
        /// <param name="subjectKeyword">subjectKeyword (required).</param>
        /// <param name="subjectType">subjectType (required).</param>
        /// <param name="status">status (required).</param>
        /// <param name="imageSamples">imageSamples (required).</param>
        public ModelV2Entity(string id = default(string), string name = default(string), string createdAt = default(string), string subjectKeyword = default(string), string subjectType = default(string), string status = default(string), List<string> imageSamples = default(List<string>))
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new ArgumentNullException("id is a required property for ModelV2Entity and cannot be null");
            }
            this.Id = id;
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new ArgumentNullException("name is a required property for ModelV2Entity and cannot be null");
            }
            this.Name = name;
            // to ensure "createdAt" is required (not null)
            if (createdAt == null)
            {
                throw new ArgumentNullException("createdAt is a required property for ModelV2Entity and cannot be null");
            }
            this.CreatedAt = createdAt;
            // to ensure "subjectKeyword" is required (not null)
            if (subjectKeyword == null)
            {
                throw new ArgumentNullException("subjectKeyword is a required property for ModelV2Entity and cannot be null");
            }
            this.SubjectKeyword = subjectKeyword;
            // to ensure "subjectType" is required (not null)
            if (subjectType == null)
            {
                throw new ArgumentNullException("subjectType is a required property for ModelV2Entity and cannot be null");
            }
            this.SubjectType = subjectType;
            // to ensure "status" is required (not null)
            if (status == null)
            {
                throw new ArgumentNullException("status is a required property for ModelV2Entity and cannot be null");
            }
            this.Status = status;
            // to ensure "imageSamples" is required (not null)
            if (imageSamples == null)
            {
                throw new ArgumentNullException("imageSamples is a required property for ModelV2Entity and cannot be null");
            }
            this.ImageSamples = imageSamples;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", IsRequired = true, EmitDefaultValue = true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name = "name", IsRequired = true, EmitDefaultValue = true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name = "createdAt", IsRequired = true, EmitDefaultValue = true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets SubjectKeyword
        /// </summary>
        [DataMember(Name = "subjectKeyword", IsRequired = true, EmitDefaultValue = true)]
        public string SubjectKeyword { get; set; }

        /// <summary>
        /// Gets or Sets SubjectType
        /// </summary>
        [DataMember(Name = "subjectType", IsRequired = true, EmitDefaultValue = true)]
        public string SubjectType { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets ImageSamples
        /// </summary>
        [DataMember(Name = "imageSamples", IsRequired = true, EmitDefaultValue = true)]
        public List<string> ImageSamples { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModelV2Entity {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  SubjectKeyword: ").Append(SubjectKeyword).Append("\n");
            sb.Append("  SubjectType: ").Append(SubjectType).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  ImageSamples: ").Append(ImageSamples).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ModelV2Entity);
        }

        /// <summary>
        /// Returns true if ModelV2Entity instances are equal
        /// </summary>
        /// <param name="input">Instance of ModelV2Entity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ModelV2Entity input)
        {
            if (input == null)
            {
                return false;
            }
            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.SubjectKeyword == input.SubjectKeyword ||
                    (this.SubjectKeyword != null &&
                    this.SubjectKeyword.Equals(input.SubjectKeyword))
                ) && 
                (
                    this.SubjectType == input.SubjectType ||
                    (this.SubjectType != null &&
                    this.SubjectType.Equals(input.SubjectType))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.ImageSamples == input.ImageSamples ||
                    this.ImageSamples != null &&
                    input.ImageSamples != null &&
                    this.ImageSamples.SequenceEqual(input.ImageSamples)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Name != null)
                {
                    hashCode = (hashCode * 59) + this.Name.GetHashCode();
                }
                if (this.CreatedAt != null)
                {
                    hashCode = (hashCode * 59) + this.CreatedAt.GetHashCode();
                }
                if (this.SubjectKeyword != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectKeyword.GetHashCode();
                }
                if (this.SubjectType != null)
                {
                    hashCode = (hashCode * 59) + this.SubjectType.GetHashCode();
                }
                if (this.Status != null)
                {
                    hashCode = (hashCode * 59) + this.Status.GetHashCode();
                }
                if (this.ImageSamples != null)
                {
                    hashCode = (hashCode * 59) + this.ImageSamples.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
