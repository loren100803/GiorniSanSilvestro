<HTML>
<HEAD>
</HEAD>
<title>San Silvestro</title> 
<BODY BGCOLOR="ffffcc">
<jsp:useBean id="SanSilvestro" class="MioBean.giorniSS"/>
<H2>San Silvestro </H2>
<HR>
<CENTER>
<H3>Giorni a San Silvestro: 
<jsp:getProperty name="SanSilvestro" property="giorni"/>
</H3>
</CENTER>
<HR>
</BODY>
</HTML>