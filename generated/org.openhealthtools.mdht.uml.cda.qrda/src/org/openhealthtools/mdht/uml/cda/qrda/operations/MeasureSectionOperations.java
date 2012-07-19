/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.qrda.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;
import org.openhealthtools.mdht.uml.cda.qrda.MeasureSection;
import org.openhealthtools.mdht.uml.cda.qrda.QRDAPackage;
import org.openhealthtools.mdht.uml.cda.qrda.QrdaPlugin;
import org.openhealthtools.mdht.uml.cda.qrda.util.QRDAValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Measure Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrda.MeasureSection#validateMeasureSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MeasureSectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MeasureSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMeasureSectionTemplateId(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionTemplateId(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.24.2.2')";

	/**
   * The cached OCL invariant for the '{@link #validateMeasureSectionTemplateId(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionTemplateId(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param measureSection The receiving '<em><b>Measure Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMeasureSectionTemplateId(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.MEASURE_SECTION);
      try
      {
        VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEASURE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(measureSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.MEASURE_SECTION__MEASURE_SECTION_TEMPLATE_ID,
             QrdaPlugin.INSTANCE.getString("MeasureSectionTemplateId"),
             new Object [] { measureSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMeasureSectionCode(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionCode(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '55186-1' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateMeasureSectionCode(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionCode(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param measureSection The receiving '<em><b>Measure Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMeasureSectionCode(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.MEASURE_SECTION);
      try
      {
        VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEASURE_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(measureSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.MEASURE_SECTION__MEASURE_SECTION_CODE,
             QrdaPlugin.INSTANCE.getString("MeasureSectionCode"),
             new Object [] { measureSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMeasureSectionText(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionText(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateMeasureSectionText(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionText(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param measureSection The receiving '<em><b>Measure Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMeasureSectionText(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.MEASURE_SECTION);
      try
      {
        VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEASURE_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(measureSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.MEASURE_SECTION__MEASURE_SECTION_TEXT,
             QrdaPlugin.INSTANCE.getString("MeasureSectionText"),
             new Object [] { measureSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMeasureSectionTitle(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionTitle(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Measure Section')";

	/**
   * The cached OCL invariant for the '{@link #validateMeasureSectionTitle(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Measure Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMeasureSectionTitle(MeasureSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param measureSection The receiving '<em><b>Measure Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMeasureSectionTitle(MeasureSection measureSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(QRDAPackage.Literals.MEASURE_SECTION);
      try
      {
        VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEASURE_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(measureSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             QRDAValidator.DIAGNOSTIC_SOURCE,
             QRDAValidator.MEASURE_SECTION__MEASURE_SECTION_TITLE,
             QrdaPlugin.INSTANCE.getString("MeasureSectionTitle"),
             new Object [] { measureSection }));
      }
       
      return false;
    }
    return true;
  }

} // MeasureSectionOperations