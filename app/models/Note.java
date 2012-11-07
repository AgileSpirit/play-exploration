package models;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.format.Formats;
import play.data.validation.Constraints;
import play.db.ebean.Model;

@Entity
public class Note extends Model {

  private static final long serialVersionUID = -5043620453775416589L;

  /*
   * ATTRIBUTES
   */

  @Id
  public Long id;

  @Formats.DateTime(pattern = "dd/MM/yyyy")
  public Date creationDate;

  @Formats.DateTime(pattern = "dd/MM/yyyy")
  public Date modificationDate;

  @Constraints.Required
  public String title;

  public String description;

  /*
   * CRUD OPERATIONS
   */

  public static Finder<Long, Note> find = new Finder<Long, Note>(Long.class, Note.class);

  public static List<Note> all() {
    return find.all();
  }

  public static void create(Note note) {
    note.creationDate = new Date();
    note.save();
  }

  public static void delete(final Long id) {
    find.ref(id).delete();
  }

  public static Note find(final Long id) {
    return find.ref(id);
  }

  public static void update(Note note) {
    note.modificationDate = new Date();
    note.update();
  }

}
