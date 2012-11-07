
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        
        <!-- DEFAULT -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.54*/routes/*10.60*/.Assets.at("stylesheets/main.css"))),format.raw/*10.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.59*/routes/*11.65*/.Assets.at("images/favicon.png"))),format.raw/*11.97*/("""">
        <script src=""""),_display_(Seq[Any](/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery-1.8.2.min.js"))),format.raw/*12.74*/("""" type="text/javascript"></script>

        <!-- BOOTSTRAP -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*15.54*/routes/*15.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*15.103*/("""">
        <script src=""""),_display_(Seq[Any](/*16.23*/routes/*16.29*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*16.71*/("""" type="text/javascript"></script>
        
    </head>
    <body>
      <header class="topbar">
        <div class="navbar navbar-inverse navbar-fixed-top">
          <div class="navbar-inner">
            <div class="container">
              <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
              </a>
              <a class="brand" href=""""),_display_(Seq[Any](/*29.39*/routes/*29.45*/.Application.index())),format.raw/*29.65*/("""">Notz-play</a>
              <div class="nav-collapse collapse">
                <ul class="nav">
                  <li class="active"><a href="#">Home</a></li>
                  <li><a href="#about">About</a></li>
                  <li><a href="#contact">Contact</a></li>
                </ul>
              </div><!--/.nav-collapse -->
            </div>
          </div>
        </div>
      </header>
      
      <div class="container">
        """),_display_(Seq[Any](/*43.10*/content)),format.raw/*43.17*/("""
      </div>
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Nov 07 23:06:20 CET 2012
                    SOURCE: C:/Users/Loulou/dev/workspace/PlayExploration/app/views/main.scala.html
                    HASH: 32c9083e0207a14df4ac7d6eea88f8e15faef615
                    MATRIX: 759->1|866->31|954->84|980->89|1112->185|1127->191|1183->225|1280->286|1295->292|1349->324|1410->349|1425->355|1492->400|1644->516|1659->522|1725->565|1786->590|1801->596|1865->638|2422->1159|2437->1165|2479->1185|2967->1637|2996->1644
                    LINES: 27->1|30->1|36->7|36->7|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|44->15|44->15|44->15|45->16|45->16|45->16|58->29|58->29|58->29|72->43|72->43
                    -- GENERATED --
                */
            