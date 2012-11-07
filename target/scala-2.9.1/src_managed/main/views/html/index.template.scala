
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Note],Form[Note],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(notes: List[Note], noteForm: Form[Note]):play.api.templates.Html = {
        _display_ {import helper._

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.43*/("""

"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("Notes list")/*6.20*/ {_display_(Seq[Any](format.raw/*6.22*/("""
    
    <h1>"""),_display_(Seq[Any](/*8.10*/notes/*8.15*/.size())),format.raw/*8.22*/(""" note(s) FLUSH</h1>
    
    <ul>
        """),_display_(Seq[Any](/*11.10*/for(note <- notes) yield /*11.28*/ {_display_(Seq[Any](format.raw/*11.30*/("""
            <li>
                """),_display_(Seq[Any](/*13.18*/note/*13.22*/.title)),format.raw/*13.28*/("""

                """),_display_(Seq[Any](/*15.18*/note/*15.22*/.description)),format.raw/*15.34*/("""
                
                """),_display_(Seq[Any](/*17.18*/form(routes.Application.deleteNote(note.id))/*17.62*/ {_display_(Seq[Any](format.raw/*17.64*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*19.18*/("""
            </li>
        """)))})),format.raw/*21.10*/("""
    </ul>
    
    <h2>Add a new note</h2>
    
    """),_display_(Seq[Any](/*26.6*/form(routes.Application.newNote())/*26.40*/ {_display_(Seq[Any](format.raw/*26.42*/("""
        
        """),_display_(Seq[Any](/*28.10*/inputText(noteForm("title"), '_id -> "title", '_label -> "Titre"))),format.raw/*28.75*/(""" 

        """),_display_(Seq[Any](/*30.10*/textarea(noteForm("description"), '_id -> "description", '_label -> "Description"))),format.raw/*30.92*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*34.6*/("""
    
""")))})))}
    }
    
    def render(notes:List[Note],noteForm:Form[Note]) = apply(notes,noteForm)
    
    def f:((List[Note],Form[Note]) => play.api.templates.Html) = (notes,noteForm) => apply(notes,noteForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 07 23:06:20 CET 2012
                    SOURCE: C:/Users/Loulou/dev/workspace/PlayExploration/app/views/index.scala.html
                    HASH: 40a8ac04f0c0ae619438cc2d8e2270278a76eeff
                    MATRIX: 770->1|940->42|970->99|1007->102|1033->120|1072->122|1124->139|1137->144|1165->151|1247->197|1281->215|1321->217|1394->254|1407->258|1435->264|1492->285|1505->289|1539->301|1612->338|1665->382|1705->384|1814->461|1876->491|1970->550|2013->584|2053->586|2110->607|2197->672|2247->686|2351->768|2456->842
                    LINES: 27->1|33->1|35->5|36->6|36->6|36->6|38->8|38->8|38->8|41->11|41->11|41->11|43->13|43->13|43->13|45->15|45->15|45->15|47->17|47->17|47->17|49->19|51->21|56->26|56->26|56->26|58->28|58->28|60->30|60->30|64->34
                    -- GENERATED --
                */
            