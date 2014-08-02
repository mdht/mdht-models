/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePlugin;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.util.EyeValidator;

import org.openhealthtools.mdht.uml.cda.ihe.operations.SurgeriesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Ocular List Of Surgeries Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection#validateOcularListOfSurgeriesSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection#validateOcularListOfSurgeriesSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection#validateOcularListOfSurgeriesSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSection#validateSurgeriesSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OcularListOfSurgeriesSectionOperations extends SurgeriesSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OcularListOfSurgeriesSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularListOfSurgeriesSectionCodeP(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularListOfSurgeriesSectionCodeP(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularListOfSurgeriesSectionCodeP(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularListOfSurgeriesSectionCodeP(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularListOfSurgeriesSection The receiving '<em><b>Ocular List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularListOfSurgeriesSectionCodeP(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_LIST_OF_SURGERIES_SECTION__OCULAR_LIST_OF_SURGERIES_SECTION_CODE_P,
						 EyePlugin.INSTANCE.getString("OcularListOfSurgeriesSectionCodeP"),
						 new Object [] { ocularListOfSurgeriesSection }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSectionCodeP", passToken);
				}
				passToken.add(ocularListOfSurgeriesSection);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularListOfSurgeriesSectionCode(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularListOfSurgeriesSectionCode(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '47519-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularListOfSurgeriesSectionCode(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularListOfSurgeriesSectionCode(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularListOfSurgeriesSection The receiving '<em><b>Ocular List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularListOfSurgeriesSectionCode(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.eye.OcularListOfSurgeriesSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(ocularListOfSurgeriesSection)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_LIST_OF_SURGERIES_SECTION__OCULAR_LIST_OF_SURGERIES_SECTION_CODE,
						 EyePlugin.INSTANCE.getString("OcularListOfSurgeriesSectionCode"),
						 new Object [] { ocularListOfSurgeriesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOcularListOfSurgeriesSectionText(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularListOfSurgeriesSectionText(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateOcularListOfSurgeriesSectionText(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Ocular List Of Surgeries Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOcularListOfSurgeriesSectionText(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularListOfSurgeriesSection The receiving '<em><b>Ocular List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOcularListOfSurgeriesSectionText(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_OCULAR_LIST_OF_SURGERIES_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_LIST_OF_SURGERIES_SECTION__OCULAR_LIST_OF_SURGERIES_SECTION_TEXT,
						 EyePlugin.INSTANCE.getString("OcularListOfSurgeriesSectionText"),
						 new Object [] { ocularListOfSurgeriesSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSurgeriesSectionTemplateId(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionTemplateId(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.12.1.2.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateSurgeriesSectionTemplateId(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Surgeries Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSurgeriesSectionTemplateId(OcularListOfSurgeriesSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param ocularListOfSurgeriesSection The receiving '<em><b>Ocular List Of Surgeries Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSurgeriesSectionTemplateId(OcularListOfSurgeriesSection ocularListOfSurgeriesSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EyePackage.Literals.OCULAR_LIST_OF_SURGERIES_SECTION);
			try {
				VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SURGERIES_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(ocularListOfSurgeriesSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EyeValidator.DIAGNOSTIC_SOURCE,
						 EyeValidator.OCULAR_LIST_OF_SURGERIES_SECTION__SURGERIES_SECTION_TEMPLATE_ID,
						 EyePlugin.INSTANCE.getString("SurgeriesSectionTemplateId"),
						 new Object [] { ocularListOfSurgeriesSection }));
			}
			 
			return false;
		}
		return true;
	}

} // OcularListOfSurgeriesSectionOperations