<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <html>
            <head>
                <title>books.xsl</title>
            </head>
            <body>
                <table border="1">
                    <tr>
                        <td>Category</td>
                        <td>FirstName</td>  
                        <td>Lastname</td>
                        <td>ContactNo</td>
                    </tr>
                    <xsl:for-each select="//Employee">
                        
                        <tr>
                            <td>
                                <xsl:apply-templates select="./@category"></xsl:apply-templates>
                            </td>
                            <td>
                                <xsl:apply-templates select="./FirstName"></xsl:apply-templates>
                            </td>
                            <td>
                                <xsl:apply-templates select="./LastName"></xsl:apply-templates>
                            </td>
                            <td>
                                <xsl:apply-templates select="./ContactNo"></xsl:apply-templates>
                            </td>
                        </tr>
                        
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>