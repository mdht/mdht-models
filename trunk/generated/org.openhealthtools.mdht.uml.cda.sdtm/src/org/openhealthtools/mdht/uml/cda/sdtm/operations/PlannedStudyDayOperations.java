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

import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Planned Study Day</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay#validatePlannedStudyDayValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlannedStudyDayOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlannedStudyDayOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedStudyDayTemplateId(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayTemplateId(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.68')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedStudyDayTemplateId(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayTemplateId(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedStudyDay The receiving '<em><b>Planned Study Day</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedStudyDayTemplateId(PlannedStudyDay plannedStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PLANNED_STUDY_DAY);
			try {
				VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_STUDY_DAY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedStudyDay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PLANNED_STUDY_DAY__PLANNED_STUDY_DAY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedStudyDayTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedStudyDay, context) }),
						 new Object [] { plannedStudyDay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedStudyDayClassCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayClassCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedStudyDayClassCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayClassCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedStudyDay The receiving '<em><b>Planned Study Day</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedStudyDayClassCode(PlannedStudyDay plannedStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PLANNED_STUDY_DAY);
			try {
				VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_STUDY_DAY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedStudyDay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PLANNED_STUDY_DAY__PLANNED_STUDY_DAY_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedStudyDayClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedStudyDay, context) }),
						 new Object [] { plannedStudyDay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedStudyDayMoodCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayMoodCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::INT";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedStudyDayMoodCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayMoodCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedStudyDay The receiving '<em><b>Planned Study Day</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedStudyDayMoodCode(PlannedStudyDay plannedStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PLANNED_STUDY_DAY);
			try {
				VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_STUDY_DAY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedStudyDay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PLANNED_STUDY_DAY__PLANNED_STUDY_DAY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedStudyDayMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedStudyDay, context) }),
						 new Object [] { plannedStudyDay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedStudyDayCodeP(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayCodeP(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedStudyDayCodeP(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayCodeP(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedStudyDay The receiving '<em><b>Planned Study Day</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedStudyDayCodeP(PlannedStudyDay plannedStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PLANNED_STUDY_DAY);
			try {
				VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_STUDY_DAY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedStudyDay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PLANNED_STUDY_DAY__PLANNED_STUDY_DAY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedStudyDayCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedStudyDay, context) }),
						 new Object [] { plannedStudyDay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedStudyDayCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C83450' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedStudyDayCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayCode(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedStudyDay The receiving '<em><b>Planned Study Day</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedStudyDayCode(PlannedStudyDay plannedStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PLANNED_STUDY_DAY);
			try {
				VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_STUDY_DAY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedStudyDay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PLANNED_STUDY_DAY__PLANNED_STUDY_DAY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedStudyDayCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedStudyDay, context) }),
						 new Object [] { plannedStudyDay }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePlannedStudyDayValue(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayValue(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePlannedStudyDayValue(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Planned Study Day Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePlannedStudyDayValue(PlannedStudyDay, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param plannedStudyDay The receiving '<em><b>Planned Study Day</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePlannedStudyDayValue(PlannedStudyDay plannedStudyDay, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PLANNED_STUDY_DAY);
			try {
				VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PLANNED_STUDY_DAY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(plannedStudyDay)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PLANNED_STUDY_DAY__PLANNED_STUDY_DAY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlannedStudyDayValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(plannedStudyDay, context) }),
						 new Object [] { plannedStudyDay }));
			}
			 
			return false;
		}
		return true;
	}

} // PlannedStudyDayOperations