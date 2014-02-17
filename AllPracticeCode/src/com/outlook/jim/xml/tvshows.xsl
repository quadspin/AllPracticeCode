<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/">
		<html>
			<head><title>TV Shows</title></head>
		</html>
		
		<body>		
			Version: <xsl:value-of select="system-property('xsl:version')" /><br />
			Vendor: <xsl:value-of select="system-property('xsl:vendor')" /><br />
			Vendor URL: <xsl:value-of select="system-property('xsl:vendor-url')" /><br />

			<!-- generate a unique ID based on the element attrib name -->			
			<xsl:for-each select="tvshow/show">
				<a href="#{generate-id(name)}">
					<xsl:value-of select="name" />
				</a><br />
		    </xsl:for-each>
		    
		    <!-- sort in ascending order -->
			<xsl:for-each select="tvshow/show">
			   <xsl:sort select="name" order="ascending" data-type="text" />
			   
			   <!-- print to the webpage the name of tv show -->
			   <h3><a name="{generate-id(name)}">
					<xsl:value-of select="name" /></a>
			   </h3>
			   
			   <!-- create an image and change the src attrib of each image -->
			   <img>
				   <xsl:attribute name="src">
				   	  <xsl:value-of select="poster/@href" />
				   </xsl:attribute>
			   </img><br />
			
			<!-- write some text -->
				<xsl:value-of select="current()" /><br />
					<p>
					The show <xsl:value-of select="name" /> 
					was released in <xsl:value-of select="release" />
					by <xsl:value-of select="network" />.
					It had an average viewership of <xsl:value-of select="viewers" />
					million people. It was cancelled in <xsl:value-of select="end-date" />
					</p><br />
			</xsl:for-each>
		    
		</body>
	</xsl:template>
</xsl:stylesheet>