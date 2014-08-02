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

import org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Concomitant Treatment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment#validateConcomitantTreatmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment#validateConcomitantTreatmentClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment#validateConcomitantTreatmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment#validateConcomitantTreatmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment#validateConcomitantTreatmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.ConcomitantTreatment#validateConcomitantTreatmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConcomitantTreatmentOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcomitantTreatmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantTreatmentTemplateId(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentTemplateId(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_TREATMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.25.25')";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantTreatmentTemplateId(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentTemplateId(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONCOMITANT_TREATMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantTreatment The receiving '<em><b>Concomitant Treatment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantTreatmentTemplateId(ConcomitantTreatment concomitantTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONCOMITANT_TREATMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_TREATMENT);
			try {
				VALIDATE_CONCOMITANT_TREATMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_TREATMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_TREATMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantTreatment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_TREATMENT__CONCOMITANT_TREATMENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantTreatmentTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantTreatment, context) }),
						 new Object [] { concomitantTreatment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantTreatmentClassCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentClassCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantTreatmentClassCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentClassCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantTreatment The receiving '<em><b>Concomitant Treatment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantTreatmentClassCode(ConcomitantTreatment concomitantTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_TREATMENT);
			try {
				VALIDATE_CONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_TREATMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantTreatment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_TREATMENT__CONCOMITANT_TREATMENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantTreatmentClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantTreatment, context) }),
						 new Object [] { concomitantTreatment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantTreatmentMoodCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentMoodCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantTreatmentMoodCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentMoodCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantTreatment The receiving '<em><b>Concomitant Treatment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantTreatmentMoodCode(ConcomitantTreatment concomitantTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_TREATMENT);
			try {
				VALIDATE_CONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_TREATMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantTreatment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_TREATMENT__CONCOMITANT_TREATMENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantTreatmentMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantTreatment, context) }),
						 new Object [] { concomitantTreatment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantTreatmentCodeP(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentCodeP(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantTreatmentCodeP(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentCodeP(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantTreatment The receiving '<em><b>Concomitant Treatment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantTreatmentCodeP(ConcomitantTreatment concomitantTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_TREATMENT);
			try {
				VALIDATE_CONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_TREATMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantTreatment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_TREATMENT__CONCOMITANT_TREATMENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantTreatmentCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantTreatment, context) }),
						 new Object [] { concomitantTreatment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantTreatmentCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C83199' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantTreatmentCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentCode(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantTreatment The receiving '<em><b>Concomitant Treatment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantTreatmentCode(ConcomitantTreatment concomitantTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_TREATMENT);
			try {
				VALIDATE_CONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_TREATMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantTreatment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_TREATMENT__CONCOMITANT_TREATMENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantTreatmentCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantTreatment, context) }),
						 new Object [] { concomitantTreatment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateConcomitantTreatmentValue(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentValue(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateConcomitantTreatmentValue(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Concomitant Treatment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateConcomitantTreatmentValue(ConcomitantTreatment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_CONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param concomitantTreatment The receiving '<em><b>Concomitant Treatment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateConcomitantTreatmentValue(ConcomitantTreatment concomitantTreatment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_CONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.CONCOMITANT_TREATMENT);
			try {
				VALIDATE_CONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_CONCOMITANT_TREATMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(concomitantTreatment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.CONCOMITANT_TREATMENT__CONCOMITANT_TREATMENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ConcomitantTreatmentValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(concomitantTreatment, context) }),
						 new Object [] { concomitantTreatment }));
			}
			 
			return false;
		}
		return true;
	}

} // ConcomitantTreatmentOperations