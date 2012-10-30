/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularCodedListOfSurgeriesSection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.HistoryOfPastIllnessSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ocular History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection#validateOcularHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection#validateOcularHistorySectionOcularListOfSurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Ocular List Of Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection#validateOcularHistorySectionOcularCodedListOfSurgeriesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Ocular Coded List Of Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection#getOcularListOfSurgeriesSection() <em>Get Ocular List Of Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection#getOcularCodedListOfSurgeriesSection() <em>Get Ocular Coded List Of Surgeries Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularHistorySection#validateHistoryOfPastIllnessSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OcularHistorySectionOperations extends HistoryOfPastIllnessSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularHistorySectionCode(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularHistorySectionCode(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '70934-5' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularHistorySectionCode(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularHistorySectionCode(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in 
	 * value.code = '70934-5' and value.codeSystem = '2.16.840.1.113883.6.1')
	 * @param ocularHistorySection The receiving '<em><b>Ocular History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularHistorySectionCode(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_HISTORY_SECTION);
			try {
				VALIDATE_OCULAR_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_HISTORY_SECTION__OCULAR_HISTORY_SECTION_CODE,
						 EyePlugin.INSTANCE.getString("OcularHistorySectionCode"),
						 new Object [] { ocularHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularHistorySectionOcularListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Ocular List Of Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularHistorySectionOcularListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularListOfSurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularHistorySectionOcularListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Ocular List Of Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularHistorySectionOcularListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularListOfSurgeriesSection))
	 * @param ocularHistorySection The receiving '<em><b>Ocular History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularHistorySectionOcularListOfSurgeriesSection(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_HISTORY_SECTION);
			try {
				VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_HISTORY_SECTION__OCULAR_HISTORY_SECTION_OCULAR_LIST_OF_SURGERIES_SECTION,
						 EyePlugin.INSTANCE.getString("OcularHistorySectionOcularListOfSurgeriesSection"),
						 new Object [] { ocularHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularHistorySectionOcularCodedListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Ocular Coded List Of Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularHistorySectionOcularCodedListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularCodedListOfSurgeriesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularHistorySectionOcularCodedListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular History Section Ocular Coded List Of Surgeries Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularHistorySectionOcularCodedListOfSurgeriesSection(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularCodedListOfSurgeriesSection))
	 * @param ocularHistorySection The receiving '<em><b>Ocular History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularHistorySectionOcularCodedListOfSurgeriesSection(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_HISTORY_SECTION);
			try {
				VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_HISTORY_SECTION__OCULAR_HISTORY_SECTION_OCULAR_CODED_LIST_OF_SURGERIES_SECTION,
						 EyePlugin.INSTANCE.getString("OcularHistorySectionOcularCodedListOfSurgeriesSection"),
						 new Object [] { ocularHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getOcularListOfSurgeriesSection(OcularHistorySection) <em>Get Ocular List Of Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularListOfSurgeriesSection(OcularHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OCULAR_LIST_OF_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularListOfSurgeriesSection))->asSequence()->any(true).oclAsType(eye::OcularListOfSurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getOcularListOfSurgeriesSection(OcularHistorySection) <em>Get Ocular List Of Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularListOfSurgeriesSection(OcularHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OCULAR_LIST_OF_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularListOfSurgeriesSection))->asSequence()->any(true).oclAsType(eye::OcularListOfSurgeriesSection)
	 * @param ocularHistorySection The receiving '<em><b>Ocular History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  OcularListOfSurgeriesSection getOcularListOfSurgeriesSection(OcularHistorySection ocularHistorySection) {
		if (GET_OCULAR_LIST_OF_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.OCULAR_HISTORY_SECTION, EyePackage.Literals.OCULAR_HISTORY_SECTION.getEAllOperations().get(60));
			try {
				GET_OCULAR_LIST_OF_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_OCULAR_LIST_OF_SURGERIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OCULAR_LIST_OF_SURGERIES_SECTION__EOCL_QRY);
		return (OcularListOfSurgeriesSection) query.evaluate(ocularHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getOcularCodedListOfSurgeriesSection(OcularHistorySection) <em>Get Ocular Coded List Of Surgeries Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularCodedListOfSurgeriesSection(OcularHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularCodedListOfSurgeriesSection))->asSequence()->any(true).oclAsType(eye::OcularCodedListOfSurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getOcularCodedListOfSurgeriesSection(OcularHistorySection) <em>Get Ocular Coded List Of Surgeries Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcularCodedListOfSurgeriesSection(OcularHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(eye::OcularCodedListOfSurgeriesSection))->asSequence()->any(true).oclAsType(eye::OcularCodedListOfSurgeriesSection)
	 * @param ocularHistorySection The receiving '<em><b>Ocular History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  OcularCodedListOfSurgeriesSection getOcularCodedListOfSurgeriesSection(OcularHistorySection ocularHistorySection) {
		if (GET_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(EyePackage.Literals.OCULAR_HISTORY_SECTION, EyePackage.Literals.OCULAR_HISTORY_SECTION.getEAllOperations().get(61));
			try {
				GET_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__EOCL_QRY = helper.createQuery(GET_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_OCULAR_CODED_LIST_OF_SURGERIES_SECTION__EOCL_QRY);
		return (OcularCodedListOfSurgeriesSection) query.evaluate(ocularHistorySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHistoryOfPastIllnessSectionTemplateId(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionTemplateId(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateHistoryOfPastIllnessSectionTemplateId(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate History Of Past Illness Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHistoryOfPastIllnessSectionTemplateId(OcularHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.3')
	 * @param ocularHistorySection The receiving '<em><b>Ocular History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHistoryOfPastIllnessSectionTemplateId(OcularHistorySection ocularHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_HISTORY_SECTION);
			try {
				VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_HISTORY_SECTION__HISTORY_OF_PAST_ILLNESS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HistoryOfPastIllnessSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(ocularHistorySection, context) }),
						 new Object [] { ocularHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // OcularHistorySectionOperations