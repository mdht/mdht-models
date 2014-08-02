/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyDayPeriod;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Foodand Water Consumption</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionStudyDayPeriod(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#validateFoodandWaterConsumptionSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getStudyDayPeriod() <em>Get Study Day Period</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.FoodandWaterConsumption#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FoodandWaterConsumptionOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoodandWaterConsumptionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.41')";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionTemplateId(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionClassCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionMoodCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionId(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionId(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionCodeP(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionStatusCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionEffectiveTime(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionValue(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionInterpretationCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionInterpretationCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionInterpretationCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionInterpretationCodeP(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionInterpretationCodeP(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionInterpretationCode(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionNonPerformanceReason(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::StudyDayPeriod) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Study Day Period</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionStudyDayPeriod(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_STUDY_DAY_PERIOD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionStudyDayPeriod", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ExclusionReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Exclusion Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionExclusionReason(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_EXCLUSION_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionGroupIdentifier(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionComment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionComment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionComment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionComment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionComment(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionDomainAssignment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionDomainAssignment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionDomainAssignment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionDomainAssignment(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionDomainAssignment(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionRelatedRecord(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionRelatedRecord(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionRelatedRecord(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionRelatedRecord(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionRelatedRecord(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFoodandWaterConsumptionSupplementalValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionSupplementalValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFoodandWaterConsumptionSupplementalValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Foodand Water Consumption Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFoodandWaterConsumptionSupplementalValue(FoodandWaterConsumption, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param foodandWaterConsumption The receiving '<em><b>Foodand Water Consumption</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateFoodandWaterConsumptionSupplementalValue(FoodandWaterConsumption foodandWaterConsumption, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION);
			try {
				VALIDATE_FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(foodandWaterConsumption)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.FOODAND_WATER_CONSUMPTION__FOODAND_WATER_CONSUMPTION_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "FoodandWaterConsumptionSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(foodandWaterConsumption, context) }),
						 new Object [] { foodandWaterConsumption }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(FoodandWaterConsumption) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(FoodandWaterConsumption) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(70));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(foodandWaterConsumption);
	}

	/**
	 * The cached OCL expression body for the '{@link #getStudyDayPeriod(FoodandWaterConsumption) <em>Get Study Day Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STUDY_DAY_PERIOD__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::StudyDayPeriod))->asSequence()->any(true).oclAsType(sdtm::StudyDayPeriod)";

	/**
	 * The cached OCL query for the '{@link #getStudyDayPeriod(FoodandWaterConsumption) <em>Get Study Day Period</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStudyDayPeriod(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STUDY_DAY_PERIOD__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  StudyDayPeriod getStudyDayPeriod(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_STUDY_DAY_PERIOD__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(71));
			try {
				GET_STUDY_DAY_PERIOD__EOCL_QRY = helper.createQuery(GET_STUDY_DAY_PERIOD__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_DAY_PERIOD__EOCL_QRY);
		return (StudyDayPeriod) query.evaluate(foodandWaterConsumption);
	}

	/**
	 * The cached OCL expression body for the '{@link #getExclusionReason(FoodandWaterConsumption) <em>Get Exclusion Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionReason(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ExclusionReason))->asSequence()->any(true).oclAsType(sdtm::ExclusionReason)";

	/**
	 * The cached OCL query for the '{@link #getExclusionReason(FoodandWaterConsumption) <em>Get Exclusion Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionReason(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExclusionReason getExclusionReason(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_EXCLUSION_REASON__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(72));
			try {
				GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
		return (ExclusionReason) query.evaluate(foodandWaterConsumption);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(FoodandWaterConsumption) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(FoodandWaterConsumption) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(73));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(foodandWaterConsumption);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(FoodandWaterConsumption) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(FoodandWaterConsumption) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(74));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(foodandWaterConsumption);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(FoodandWaterConsumption) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(FoodandWaterConsumption) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(75));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(foodandWaterConsumption);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(FoodandWaterConsumption) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(FoodandWaterConsumption) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(76));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(foodandWaterConsumption);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(FoodandWaterConsumption) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(FoodandWaterConsumption) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(FoodandWaterConsumption)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(FoodandWaterConsumption foodandWaterConsumption) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION, SdtmPackage.Literals.FOODAND_WATER_CONSUMPTION.getEAllOperations().get(77));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(foodandWaterConsumption);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

} // FoodandWaterConsumptionOperations