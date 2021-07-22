<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="xml" indent="yes"/>
	<xsl:template match="/">
		<Fruit>
			<xsl:apply-templates/>
		</Fruit>
	</xsl:template>
	
	<xsl:template match="Fruits/fruit">
		<Fruit>
			<xsl:attribute name="name"><xsl:value-of select="name"/></xsl:attribute>
			<color><xsl:value-of select ="color"/></color>
		</Fruit>
	</xsl:template>

</xsl:stylesheet>
