/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Assay Quantitation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation#validateAssayQuantitationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation#validateAssayQuantitationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation#validateAssayQuantitationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation#validateAssayQuantitationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation#validateAssayQuantitationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation#validateAssayQuantitationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssayQuantitationOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssayQuantitationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssayQuantitationTemplateId(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationTemplateId(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSAY_QUANTITATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssayQuantitationTemplateId(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationTemplateId(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ASSAY_QUANTITATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assayQuantitation The receiving '<em><b>Assay Quantitation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAssayQuantitationTemplateId(AssayQuantitation assayQuantitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSAY_QUANTITATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ASSAY_QUANTITATION);
			try {
				VALIDATE_ASSAY_QUANTITATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSAY_QUANTITATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSAY_QUANTITATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assayQuantitation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ASSAY_QUANTITATION__ASSAY_QUANTITATION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssayQuantitationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assayQuantitation, context) }),
						 new Object [] { assayQuantitation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssayQuantitationClassCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationClassCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateAssayQuantitationClassCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationClassCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assayQuantitation The receiving '<em><b>Assay Quantitation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAssayQuantitationClassCode(AssayQuantitation assayQuantitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ASSAY_QUANTITATION);
			try {
				VALIDATE_ASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSAY_QUANTITATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assayQuantitation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ASSAY_QUANTITATION__ASSAY_QUANTITATION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssayQuantitationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assayQuantitation, context) }),
						 new Object [] { assayQuantitation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssayQuantitationMoodCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationMoodCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateAssayQuantitationMoodCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationMoodCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assayQuantitation The receiving '<em><b>Assay Quantitation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAssayQuantitationMoodCode(AssayQuantitation assayQuantitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ASSAY_QUANTITATION);
			try {
				VALIDATE_ASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSAY_QUANTITATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assayQuantitation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ASSAY_QUANTITATION__ASSAY_QUANTITATION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssayQuantitationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assayQuantitation, context) }),
						 new Object [] { assayQuantitation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssayQuantitationCodeP(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationCodeP(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateAssayQuantitationCodeP(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationCodeP(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assayQuantitation The receiving '<em><b>Assay Quantitation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAssayQuantitationCodeP(AssayQuantitation assayQuantitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ASSAY_QUANTITATION);
			try {
				VALIDATE_ASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSAY_QUANTITATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assayQuantitation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ASSAY_QUANTITATION__ASSAY_QUANTITATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssayQuantitationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assayQuantitation, context) }),
						 new Object [] { assayQuantitation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssayQuantitationCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'AQtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateAssayQuantitationCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationCode(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assayQuantitation The receiving '<em><b>Assay Quantitation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAssayQuantitationCode(AssayQuantitation assayQuantitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ASSAY_QUANTITATION);
			try {
				VALIDATE_ASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSAY_QUANTITATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assayQuantitation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ASSAY_QUANTITATION__ASSAY_QUANTITATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssayQuantitationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assayQuantitation, context) }),
						 new Object [] { assayQuantitation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAssayQuantitationValue(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationValue(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::IVL_PQ)))";

	/**
	 * The cached OCL invariant for the '{@link #validateAssayQuantitationValue(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Assay Quantitation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAssayQuantitationValue(AssayQuantitation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param assayQuantitation The receiving '<em><b>Assay Quantitation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAssayQuantitationValue(AssayQuantitation assayQuantitation, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ASSAY_QUANTITATION);
			try {
				VALIDATE_ASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ASSAY_QUANTITATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(assayQuantitation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ASSAY_QUANTITATION__ASSAY_QUANTITATION_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "AssayQuantitationValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(assayQuantitation, context) }),
						 new Object [] { assayQuantitation }));
			}
			 
			return false;
		}
		return true;
	}

} // AssayQuantitationOperations