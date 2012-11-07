// @SOURCE:C:/Users/Loulou/dev/workspace/PlayExploration/conf/routes
// @HASH:89db901a30696f60fb9c00767f81dec4a0012428
// @DATE:Wed Nov 07 23:06:16 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def notes() = {
   Call("GET", "/notes")
}
                                                        
 
// @LINE:10
def newNote() = {
   Call("POST", "/notes")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:11
def deleteNote(id:Long) = {
   Call("POST", "/notes/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def notes = JavascriptReverseRoute(
   "controllers.Application.notes",
   """
      function() {
      return _wA({method:"GET", url:"/notes"})
      }
   """
)
                                                        
 
// @LINE:10
def newNote = JavascriptReverseRoute(
   "controllers.Application.newNote",
   """
      function() {
      return _wA({method:"POST", url:"/notes"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:11
def deleteNote = JavascriptReverseRoute(
   "controllers.Application.deleteNote",
   """
      function(id) {
      return _wA({method:"POST", url:"/notes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def notes() = new play.api.mvc.HandlerRef(
   controllers.Application.notes(), HandlerDef(this, "controllers.Application", "notes", Seq())
)
                              
 
// @LINE:10
def newNote() = new play.api.mvc.HandlerRef(
   controllers.Application.newNote(), HandlerDef(this, "controllers.Application", "newNote", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:11
def deleteNote(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteNote(id), HandlerDef(this, "controllers.Application", "deleteNote", Seq(classOf[Long]))
)
                              

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                