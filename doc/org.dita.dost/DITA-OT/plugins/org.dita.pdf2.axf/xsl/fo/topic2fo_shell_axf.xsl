<?xml version="1.0" encoding="UTF-8"?><!--
  This file is part of the DITA Open Toolkit project.
  See the accompanying license.txt file for applicable licenses.
--><xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
  
  <xsl:import href="plugin:org.dita.pdf2:xsl/fo/topic2fo.xsl"/>

  <xsl:import href="../../cfg/fo/attrs/tables-attr_axf.xsl"/>
  <xsl:import href="../../cfg/fo/attrs/toc-attr_axf.xsl"/>
  <xsl:import href="../../cfg/fo/attrs/index-attr_axf.xsl"/>
  <xsl:import href="root-processing_axf.xsl"/>
  <xsl:import href="index_axf.xsl"/>
  
  <xsl:import xmlns:dita="http://dita-ot.sourceforge.net" href="../../../org.eclipse.mdht.cda/xsl/mdhtcda2xslfo.xsl"/>

  <xsl:import href="cfg:fo/attrs/custom.xsl"/>
  <xsl:import href="cfg:fo/xsl/custom.xsl"/>
  
</xsl:stylesheet>