package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public open class HTMLTag(override val tagName : String, override val consumer : TagConsumer<*>, val initialAttributes : Map<String, String>) : Tag {

    override val attributes : DelegatingMap = DelegatingMap(initialAttributes, this){ consumer }


fun a(href : String? = null, target : String? = null, block : A.() -> Unit) : Unit = buildA(listOf("href" to href,"target" to target).toAttributesMap(), consumer, block)

fun abbr(block : ABBR.() -> Unit) : Unit = buildABBR(emptyMap(), consumer, block)

fun address(block : ADDRESS.() -> Unit) : Unit = buildADDRESS(emptyMap(), consumer, block)

fun area(alt : String? = null, block : AREA.() -> Unit) : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, block)
fun area(alt : String? = null, content : String = "") : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, {+content})
fun rectArea(alt : String? = null, block : AREA.() -> Unit) : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, block)
fun circleArea(alt : String? = null, block : AREA.() -> Unit) : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, block)
fun polyArea(alt : String? = null, block : AREA.() -> Unit) : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, block)
fun defaultArea(alt : String? = null, block : AREA.() -> Unit) : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, block)
fun rectArea(alt : String? = null, content : String = "") : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, {+content})
fun circleArea(alt : String? = null, content : String = "") : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, {+content})
fun polyArea(alt : String? = null, content : String = "") : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, {+content})
fun defaultArea(alt : String? = null, content : String = "") : Unit = buildAREA(listOf("alt" to alt).toAttributesMap(), consumer, {+content})

fun article(block : ARTICLE.() -> Unit) : Unit = buildARTICLE(emptyMap(), consumer, block)

fun aside(block : ASIDE.() -> Unit) : Unit = buildASIDE(emptyMap(), consumer, block)

fun audio(block : AUDIO.() -> Unit) : Unit = buildAUDIO(emptyMap(), consumer, block)

fun b(block : B.() -> Unit) : Unit = buildB(emptyMap(), consumer, block)

fun base(block : BASE.() -> Unit) : Unit = buildBASE(emptyMap(), consumer, block)
fun base(content : String = "") : Unit = buildBASE(emptyMap(), consumer, {+content})

fun bdi(block : BDI.() -> Unit) : Unit = buildBDI(emptyMap(), consumer, block)

fun bdo(block : BDO.() -> Unit) : Unit = buildBDO(emptyMap(), consumer, block)

fun blockQuote(block : BLOCKQUOTE.() -> Unit) : Unit = buildBLOCKQUOTE(emptyMap(), consumer, block)

fun body(block : BODY.() -> Unit) : Unit = buildBODY(emptyMap(), consumer, block)

fun br(block : BR.() -> Unit) : Unit = buildBR(emptyMap(), consumer, block)
fun br(content : String = "") : Unit = buildBR(emptyMap(), consumer, {+content})

fun button(block : BUTTON.() -> Unit) : Unit = buildBUTTON(emptyMap(), consumer, block)
fun getButton(block : BUTTON.() -> Unit) : Unit = buildBUTTON(emptyMap(), consumer, block)
fun postButton(block : BUTTON.() -> Unit) : Unit = buildBUTTON(emptyMap(), consumer, block)
fun putButton(block : BUTTON.() -> Unit) : Unit = buildBUTTON(emptyMap(), consumer, block)
fun deleteButton(block : BUTTON.() -> Unit) : Unit = buildBUTTON(emptyMap(), consumer, block)

fun canvas(block : CANVAS.() -> Unit) : Unit = buildCANVAS(emptyMap(), consumer, block)
fun canvas(content : String = "") : Unit = buildCANVAS(emptyMap(), consumer, {+content})

fun caption(block : CAPTION.() -> Unit) : Unit = buildCAPTION(emptyMap(), consumer, block)

fun cite(block : CITE.() -> Unit) : Unit = buildCITE(emptyMap(), consumer, block)

fun code(block : CODE.() -> Unit) : Unit = buildCODE(emptyMap(), consumer, block)

fun col(block : COL.() -> Unit) : Unit = buildCOL(emptyMap(), consumer, block)
fun col(content : String = "") : Unit = buildCOL(emptyMap(), consumer, {+content})

fun colGroup(block : COLGROUP.() -> Unit) : Unit = buildCOLGROUP(emptyMap(), consumer, block)

fun command(block : COMMAND.() -> Unit) : Unit = buildCOMMAND(emptyMap(), consumer, block)
fun command(content : String = "") : Unit = buildCOMMAND(emptyMap(), consumer, {+content})
fun commandCommand(block : COMMAND.() -> Unit) : Unit = buildCOMMAND(emptyMap(), consumer, block)
fun checkBoxCommand(block : COMMAND.() -> Unit) : Unit = buildCOMMAND(emptyMap(), consumer, block)
fun radioCommand(block : COMMAND.() -> Unit) : Unit = buildCOMMAND(emptyMap(), consumer, block)
fun commandCommand(content : String = "") : Unit = buildCOMMAND(emptyMap(), consumer, {+content})
fun checkBoxCommand(content : String = "") : Unit = buildCOMMAND(emptyMap(), consumer, {+content})
fun radioCommand(content : String = "") : Unit = buildCOMMAND(emptyMap(), consumer, {+content})

fun dataList(block : DATALIST.() -> Unit) : Unit = buildDATALIST(emptyMap(), consumer, block)

fun dd(block : DD.() -> Unit) : Unit = buildDD(emptyMap(), consumer, block)

fun del(block : DEL.() -> Unit) : Unit = buildDEL(emptyMap(), consumer, block)

fun details(block : DETAILS.() -> Unit) : Unit = buildDETAILS(emptyMap(), consumer, block)

fun dfn(block : DFN.() -> Unit) : Unit = buildDFN(emptyMap(), consumer, block)

fun dialog(block : DIALOG.() -> Unit) : Unit = buildDIALOG(emptyMap(), consumer, block)

fun div(classes : Set<String>? = null, block : DIV.() -> Unit) : Unit = buildDIV(listOf("class" to classes?.stringSetEncode()).toAttributesMap(), consumer, block)

fun dl(block : DL.() -> Unit) : Unit = buildDL(emptyMap(), consumer, block)

fun dt(block : DT.() -> Unit) : Unit = buildDT(emptyMap(), consumer, block)

fun em(block : EM.() -> Unit) : Unit = buildEM(emptyMap(), consumer, block)

fun embed(block : EMBED.() -> Unit) : Unit = buildEMBED(emptyMap(), consumer, block)
fun embed(content : String = "") : Unit = buildEMBED(emptyMap(), consumer, {+content})

fun fieldSet(block : FIELDSET.() -> Unit) : Unit = buildFIELDSET(emptyMap(), consumer, block)

fun figure(block : FIGURE.() -> Unit) : Unit = buildFIGURE(emptyMap(), consumer, block)

fun footer(block : FOOTER.() -> Unit) : Unit = buildFOOTER(emptyMap(), consumer, block)

fun form(action : String? = null, block : FORM.() -> Unit) : Unit = buildFORM(listOf("action" to action).toAttributesMap(), consumer, block)
fun getForm(action : String? = null, block : FORM.() -> Unit) : Unit = buildFORM(listOf("action" to action).toAttributesMap(), consumer, block)
fun postForm(action : String? = null, block : FORM.() -> Unit) : Unit = buildFORM(listOf("action" to action).toAttributesMap(), consumer, block)
fun putForm(action : String? = null, block : FORM.() -> Unit) : Unit = buildFORM(listOf("action" to action).toAttributesMap(), consumer, block)
fun deleteForm(action : String? = null, block : FORM.() -> Unit) : Unit = buildFORM(listOf("action" to action).toAttributesMap(), consumer, block)

fun h1(block : H1.() -> Unit) : Unit = buildH1(emptyMap(), consumer, block)

fun h2(block : H2.() -> Unit) : Unit = buildH2(emptyMap(), consumer, block)

fun h3(block : H3.() -> Unit) : Unit = buildH3(emptyMap(), consumer, block)

fun h4(block : H4.() -> Unit) : Unit = buildH4(emptyMap(), consumer, block)

fun h5(block : H5.() -> Unit) : Unit = buildH5(emptyMap(), consumer, block)

fun h6(block : H6.() -> Unit) : Unit = buildH6(emptyMap(), consumer, block)

fun head(block : HEAD.() -> Unit) : Unit = buildHEAD(emptyMap(), consumer, block)

fun header(block : HEADER.() -> Unit) : Unit = buildHEADER(emptyMap(), consumer, block)

fun hGroup(block : HGROUP.() -> Unit) : Unit = buildHGROUP(emptyMap(), consumer, block)

fun hr(block : HR.() -> Unit) : Unit = buildHR(emptyMap(), consumer, block)
fun hr(content : String = "") : Unit = buildHR(emptyMap(), consumer, {+content})

fun html(block : HTML.() -> Unit) : Unit = buildHTML(emptyMap(), consumer, block)

fun i(block : I.() -> Unit) : Unit = buildI(emptyMap(), consumer, block)

fun iframe(block : IFRAME.() -> Unit) : Unit = buildIFRAME(emptyMap(), consumer, block)
fun iframe(content : String = "") : Unit = buildIFRAME(emptyMap(), consumer, {+content})
fun allowSameOriginIframe(block : IFRAME.() -> Unit) : Unit = buildIFRAME(emptyMap(), consumer, block)
fun allowFormSIframe(block : IFRAME.() -> Unit) : Unit = buildIFRAME(emptyMap(), consumer, block)
fun allowScriptSIframe(block : IFRAME.() -> Unit) : Unit = buildIFRAME(emptyMap(), consumer, block)
fun allowSameOriginIframe(content : String = "") : Unit = buildIFRAME(emptyMap(), consumer, {+content})
fun allowFormSIframe(content : String = "") : Unit = buildIFRAME(emptyMap(), consumer, {+content})
fun allowScriptSIframe(content : String = "") : Unit = buildIFRAME(emptyMap(), consumer, {+content})

fun img(alt : String? = null, src : String? = null, block : IMG.() -> Unit) : Unit = buildIMG(listOf("alt" to alt,"src" to src).toAttributesMap(), consumer, block)
fun img(alt : String? = null, src : String? = null, content : String = "") : Unit = buildIMG(listOf("alt" to alt,"src" to src).toAttributesMap(), consumer, {+content})

fun input(type : InputType? = null, name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to type?.enumEncode(),"name" to name).toAttributesMap(), consumer, block)
fun input(type : InputType? = null, name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to type?.enumEncode(),"name" to name).toAttributesMap(), consumer, {+content})
fun buttonInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.button.realValue,"name" to name).toAttributesMap(), consumer, block)
fun checkBoxInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.checkBox.realValue,"name" to name).toAttributesMap(), consumer, block)
fun colOrInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.colOr.realValue,"name" to name).toAttributesMap(), consumer, block)
fun dateInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.date.realValue,"name" to name).toAttributesMap(), consumer, block)
fun dateTimeInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.dateTime.realValue,"name" to name).toAttributesMap(), consumer, block)
fun dateTimeLocalInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.dateTimeLocal.realValue,"name" to name).toAttributesMap(), consumer, block)
fun emailInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.email.realValue,"name" to name).toAttributesMap(), consumer, block)
fun fileInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.file.realValue,"name" to name).toAttributesMap(), consumer, block)
fun hiddenInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.hidden.realValue,"name" to name).toAttributesMap(), consumer, block)
fun imageInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.image.realValue,"name" to name).toAttributesMap(), consumer, block)
fun monthInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.month.realValue,"name" to name).toAttributesMap(), consumer, block)
fun numberInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.number.realValue,"name" to name).toAttributesMap(), consumer, block)
fun passwordInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.password.realValue,"name" to name).toAttributesMap(), consumer, block)
fun radioInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.radio.realValue,"name" to name).toAttributesMap(), consumer, block)
fun rangeInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.range.realValue,"name" to name).toAttributesMap(), consumer, block)
fun resetInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.reset.realValue,"name" to name).toAttributesMap(), consumer, block)
fun searchInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.search.realValue,"name" to name).toAttributesMap(), consumer, block)
fun submitInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.submit.realValue,"name" to name).toAttributesMap(), consumer, block)
fun textInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.text.realValue,"name" to name).toAttributesMap(), consumer, block)
fun telInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.tel.realValue,"name" to name).toAttributesMap(), consumer, block)
fun timeInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.time.realValue,"name" to name).toAttributesMap(), consumer, block)
fun urlInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.url.realValue,"name" to name).toAttributesMap(), consumer, block)
fun weekInput(name : String? = null, block : INPUT.() -> Unit) : Unit = buildINPUT(listOf("type" to InputType.week.realValue,"name" to name).toAttributesMap(), consumer, block)
fun buttonInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.button.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun checkBoxInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.checkBox.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun colOrInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.colOr.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun dateInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.date.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun dateTimeInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.dateTime.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun dateTimeLocalInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.dateTimeLocal.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun emailInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.email.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun fileInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.file.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun hiddenInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.hidden.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun imageInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.image.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun monthInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.month.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun numberInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.number.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun passwordInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.password.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun radioInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.radio.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun rangeInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.range.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun resetInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.reset.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun searchInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.search.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun submitInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.submit.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun textInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.text.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun telInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.tel.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun timeInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.time.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun urlInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.url.realValue,"name" to name).toAttributesMap(), consumer, {+content})
fun weekInput(name : String? = null, content : String = "") : Unit = buildINPUT(listOf("type" to InputType.week.realValue,"name" to name).toAttributesMap(), consumer, {+content})

fun ins(block : INS.() -> Unit) : Unit = buildINS(emptyMap(), consumer, block)

fun kbd(block : KBD.() -> Unit) : Unit = buildKBD(emptyMap(), consumer, block)

fun keyGen(block : KEYGEN.() -> Unit) : Unit = buildKEYGEN(emptyMap(), consumer, block)
fun keyGen(content : String = "") : Unit = buildKEYGEN(emptyMap(), consumer, {+content})
fun rsaKeyGen(block : KEYGEN.() -> Unit) : Unit = buildKEYGEN(emptyMap(), consumer, block)
fun rsaKeyGen(content : String = "") : Unit = buildKEYGEN(emptyMap(), consumer, {+content})

fun label(block : LABEL.() -> Unit) : Unit = buildLABEL(emptyMap(), consumer, block)

fun legEnd(block : LEGEND.() -> Unit) : Unit = buildLEGEND(emptyMap(), consumer, block)

fun li(block : LI.() -> Unit) : Unit = buildLI(emptyMap(), consumer, block)

fun link(block : LINK.() -> Unit) : Unit = buildLINK(emptyMap(), consumer, block)
fun link(content : String = "") : Unit = buildLINK(emptyMap(), consumer, {+content})

fun map(name : String? = null, block : MAP.() -> Unit) : Unit = buildMAP(listOf("name" to name).toAttributesMap(), consumer, block)

fun mark(block : MARK.() -> Unit) : Unit = buildMARK(emptyMap(), consumer, block)

fun math(block : MATH.() -> Unit) : Unit = buildMATH(emptyMap(), consumer, block)

fun mathml(block : MATHML.() -> Unit) : Unit = buildMATHML(emptyMap(), consumer, block)
fun mathml(content : String = "") : Unit = buildMATHML(emptyMap(), consumer, {+content})

fun menu(block : MENU.() -> Unit) : Unit = buildMENU(emptyMap(), consumer, block)
fun contextMenu(block : MENU.() -> Unit) : Unit = buildMENU(emptyMap(), consumer, block)
fun toolbarMenu(block : MENU.() -> Unit) : Unit = buildMENU(emptyMap(), consumer, block)
fun listMenu(block : MENU.() -> Unit) : Unit = buildMENU(emptyMap(), consumer, block)

fun meta(block : META.() -> Unit) : Unit = buildMETA(emptyMap(), consumer, block)
fun meta(content : String = "") : Unit = buildMETA(emptyMap(), consumer, {+content})

fun meter(block : METER.() -> Unit) : Unit = buildMETER(emptyMap(), consumer, block)

fun nav(block : NAV.() -> Unit) : Unit = buildNAV(emptyMap(), consumer, block)

fun noScript(block : NOSCRIPT.() -> Unit) : Unit = buildNOSCRIPT(emptyMap(), consumer, block)

fun object_(block : OBJECT_.() -> Unit) : Unit = buildOBJECT_(emptyMap(), consumer, block)

fun ol(block : OL.() -> Unit) : Unit = buildOL(emptyMap(), consumer, block)

fun optGroup(label : String? = null, block : OPTGROUP.() -> Unit) : Unit = buildOPTGROUP(listOf("label" to label).toAttributesMap(), consumer, block)

fun option(block : OPTION.() -> Unit) : Unit = buildOPTION(emptyMap(), consumer, block)
fun option(content : String = "") : Unit = buildOPTION(emptyMap(), consumer, {+content})

fun output(block : OUTPUT.() -> Unit) : Unit = buildOUTPUT(emptyMap(), consumer, block)

fun p(block : P.() -> Unit) : Unit = buildP(emptyMap(), consumer, block)

fun param(name : String? = null, value : String? = null, block : PARAM.() -> Unit) : Unit = buildPARAM(listOf("name" to name,"value" to value).toAttributesMap(), consumer, block)
fun param(name : String? = null, value : String? = null, content : String = "") : Unit = buildPARAM(listOf("name" to name,"value" to value).toAttributesMap(), consumer, {+content})

fun pre(block : PRE.() -> Unit) : Unit = buildPRE(emptyMap(), consumer, block)

fun progress(block : PROGRESS.() -> Unit) : Unit = buildPROGRESS(emptyMap(), consumer, block)

fun q(block : Q.() -> Unit) : Unit = buildQ(emptyMap(), consumer, block)

fun rp(block : RP.() -> Unit) : Unit = buildRP(emptyMap(), consumer, block)

fun rt(block : RT.() -> Unit) : Unit = buildRT(emptyMap(), consumer, block)

fun ruby(block : RUBY.() -> Unit) : Unit = buildRUBY(emptyMap(), consumer, block)

fun samp(block : SAMP.() -> Unit) : Unit = buildSAMP(emptyMap(), consumer, block)

fun script(type : ScriptType? = null, src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), consumer, block)
fun script(type : ScriptType? = null, src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to type?.enumEncode(),"src" to src).toAttributesMap(), consumer, {+content})
fun textEcmaScriptScript(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textEcmaScript.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScriptScript(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScript10Script(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript10.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScript11Script(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript11.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScript12Script(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript12.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScript13Script(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript13.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScript14Script(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript14.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJavaScript15Script(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript15.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textJScriptScript(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textJScript.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textXJavaScriptScript(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textXJavaScript.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textXEcmaScriptScript(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textXEcmaScript.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textVbScriptScript(src : String? = null, block : SCRIPT.() -> Unit) : Unit = buildSCRIPT(listOf("type" to ScriptType.textVbScript.realValue,"src" to src).toAttributesMap(), consumer, block)
fun textEcmaScriptScript(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textEcmaScript.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScriptScript(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScript10Script(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript10.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScript11Script(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript11.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScript12Script(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript12.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScript13Script(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript13.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScript14Script(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript14.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJavaScript15Script(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJavaScript15.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textJScriptScript(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textJScript.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textXJavaScriptScript(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textXJavaScript.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textXEcmaScriptScript(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textXEcmaScript.realValue,"src" to src).toAttributesMap(), consumer, {+content})
fun textVbScriptScript(src : String? = null, content : String = "") : Unit = buildSCRIPT(listOf("type" to ScriptType.textVbScript.realValue,"src" to src).toAttributesMap(), consumer, {+content})

fun section(block : SECTION.() -> Unit) : Unit = buildSECTION(emptyMap(), consumer, block)

fun select(block : SELECT.() -> Unit) : Unit = buildSELECT(emptyMap(), consumer, block)

fun small(block : SMALL.() -> Unit) : Unit = buildSMALL(emptyMap(), consumer, block)

fun source(block : SOURCE.() -> Unit) : Unit = buildSOURCE(emptyMap(), consumer, block)
fun source(content : String = "") : Unit = buildSOURCE(emptyMap(), consumer, {+content})

fun span(block : SPAN.() -> Unit) : Unit = buildSPAN(emptyMap(), consumer, block)

fun strong(block : STRONG.() -> Unit) : Unit = buildSTRONG(emptyMap(), consumer, block)

fun style(block : STYLE.() -> Unit) : Unit = buildSTYLE(emptyMap(), consumer, block)
fun style(content : String = "") : Unit = buildSTYLE(emptyMap(), consumer, {+content})

fun sub(block : SUB.() -> Unit) : Unit = buildSUB(emptyMap(), consumer, block)

fun sup(block : SUP.() -> Unit) : Unit = buildSUP(emptyMap(), consumer, block)

fun svg(block : SVG.() -> Unit) : Unit = buildSVG(emptyMap(), consumer, block)
fun svg(content : String = "") : Unit = buildSVG(emptyMap(), consumer, {+content})

fun table(block : TABLE.() -> Unit) : Unit = buildTABLE(emptyMap(), consumer, block)

fun tbody(block : TBODY.() -> Unit) : Unit = buildTBODY(emptyMap(), consumer, block)

fun td(block : TD.() -> Unit) : Unit = buildTD(emptyMap(), consumer, block)

fun textArea(rows : String? = null, cols : String? = null, block : TEXTAREA.() -> Unit) : Unit = buildTEXTAREA(listOf("rows" to rows,"cols" to cols).toAttributesMap(), consumer, block)
fun textArea(rows : String? = null, cols : String? = null, content : String = "") : Unit = buildTEXTAREA(listOf("rows" to rows,"cols" to cols).toAttributesMap(), consumer, {+content})
fun hardTextArea(rows : String? = null, cols : String? = null, block : TEXTAREA.() -> Unit) : Unit = buildTEXTAREA(listOf("rows" to rows,"cols" to cols).toAttributesMap(), consumer, block)
fun softTextArea(rows : String? = null, cols : String? = null, block : TEXTAREA.() -> Unit) : Unit = buildTEXTAREA(listOf("rows" to rows,"cols" to cols).toAttributesMap(), consumer, block)
fun hardTextArea(rows : String? = null, cols : String? = null, content : String = "") : Unit = buildTEXTAREA(listOf("rows" to rows,"cols" to cols).toAttributesMap(), consumer, {+content})
fun softTextArea(rows : String? = null, cols : String? = null, content : String = "") : Unit = buildTEXTAREA(listOf("rows" to rows,"cols" to cols).toAttributesMap(), consumer, {+content})

fun tfoot(block : TFOOT.() -> Unit) : Unit = buildTFOOT(emptyMap(), consumer, block)

fun th(block : TH.() -> Unit) : Unit = buildTH(emptyMap(), consumer, block)
fun colTh(block : TH.() -> Unit) : Unit = buildTH(emptyMap(), consumer, block)
fun colGroupTh(block : TH.() -> Unit) : Unit = buildTH(emptyMap(), consumer, block)
fun rowTh(block : TH.() -> Unit) : Unit = buildTH(emptyMap(), consumer, block)
fun rowGroupTh(block : TH.() -> Unit) : Unit = buildTH(emptyMap(), consumer, block)

fun thead(block : THEAD.() -> Unit) : Unit = buildTHEAD(emptyMap(), consumer, block)

fun time(block : TIME.() -> Unit) : Unit = buildTIME(emptyMap(), consumer, block)

fun title(block : TITLE.() -> Unit) : Unit = buildTITLE(emptyMap(), consumer, block)
fun title(content : String = "") : Unit = buildTITLE(emptyMap(), consumer, {+content})

fun tr(block : TR.() -> Unit) : Unit = buildTR(emptyMap(), consumer, block)

fun ul(block : UL.() -> Unit) : Unit = buildUL(emptyMap(), consumer, block)

fun var_(block : VAR_.() -> Unit) : Unit = buildVAR_(emptyMap(), consumer, block)

fun video(block : VIDEO.() -> Unit) : Unit = buildVIDEO(emptyMap(), consumer, block)

fun Entities.plus() : Unit{
consumer.onTagContentEntity(this)}
fun String.plus() : Unit{
consumer.onTagContentEntity(this)}
}
