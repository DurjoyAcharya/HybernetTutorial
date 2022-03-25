# HibernetTutorial
> This repo is about hybernet tutorial for starter
<h4>Commonly Used Anotation in Hybernet</h4>
<ul>
  <li>@Entity (Use to mark any class as entity)</li>
  <li>@Table (Use to change table details)</li>
  <li>@Id (Use to mark column as id{primary key})</li>
  <li>@GeneratedValue (hibernet will automethically generated values for that using an internal sequance Therefore we don't have to set it mamually)</li>
  <li>@Column (Can be used to specify column mappings For example,to change to column name in the associated table in database)</li>
  <li>@Transient (This tells hibernet not to save this feild )</li>
  <li>@Temporal (Over a date feild tells hibernate the format in which the date needs to be saved)</li>
  <li>@Lob (tells hibernet that this is a large object , not a simple object)</li>
  <li>@OneToOne</li>
  <li>@OneToMany</li>
  <li>@ManyToOne</li>
  <li>@JoinColumn</li>
</ul>
