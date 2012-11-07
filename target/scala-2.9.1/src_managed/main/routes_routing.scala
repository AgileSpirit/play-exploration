// @SOURCE:C:/Users/Loulou/dev/workspace/PlayExploration/conf/routes
// @HASH:89db901a30696f60fb9c00767f81dec4a0012428
// @DATE:Wed Nov 07 23:06:16 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Application_notes1 = Route("GET", PathPattern(List(StaticPart("/notes"))))
                    

// @LINE:10
val controllers_Application_newNote2 = Route("POST", PathPattern(List(StaticPart("/notes"))))
                    

// @LINE:11
val controllers_Application_deleteNote3 = Route("POST", PathPattern(List(StaticPart("/notes/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:14
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/notes""","""controllers.Application.notes()"""),("""POST""","""/notes""","""controllers.Application.newNote()"""),("""POST""","""/notes/$id<[^/]+>/delete""","""controllers.Application.deleteNote(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_notes1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.notes(), HandlerDef(this, "controllers.Application", "notes", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_newNote2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newNote(), HandlerDef(this, "controllers.Application", "newNote", Nil))
   }
}
                    

// @LINE:11
case controllers_Application_deleteNote3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteNote(id), HandlerDef(this, "controllers.Application", "deleteNote", Seq(classOf[Long])))
   }
}
                    

// @LINE:14
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                