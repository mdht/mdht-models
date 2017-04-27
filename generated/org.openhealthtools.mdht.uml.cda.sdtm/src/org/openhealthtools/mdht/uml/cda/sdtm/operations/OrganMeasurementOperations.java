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
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Organ Measurement</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#validateOrganMeasurementSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getComment() <em>Get Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OrganMeasurement#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganMeasurementOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrganMeasurementOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.62')";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementTemplateId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementTemplateId(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementClassCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementClassCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementMoodCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementMoodCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (self.id->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementId(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementId(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementCodeP(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'unknonw' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementStatusCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementStatusCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementValue(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementInterpretationCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementInterpretationCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementInterpretationCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementInterpretationCodeP(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementInterpretationCodeP(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementInterpretationCode(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementInterpretationCode(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementNonPerformanceReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementNonPerformanceReason(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::SpecimenInformation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Specimen Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementSpecimenInformation(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementSpecimenInformation(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_SPECIMEN_INFORMATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementDataCollection(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementDataCollection(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementComment(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementComment(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementComment(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementComment(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementComment(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementExclusionReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementExclusionReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ExclusionReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementExclusionReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Exclusion Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementExclusionReason(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementExclusionReason(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_EXCLUSION_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementRelatedRecord(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementRelatedRecord(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementRelatedRecord(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementRelatedRecord(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementRelatedRecord(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOrganMeasurementSupplementalValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementSupplementalValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateOrganMeasurementSupplementalValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Organ Measurement Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOrganMeasurementSupplementalValue(OrganMeasurement, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param organMeasurement The receiving '<em><b>Organ Measurement</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOrganMeasurementSupplementalValue(OrganMeasurement organMeasurement, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.ORGAN_MEASUREMENT);
			try {
				VALIDATE_ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(organMeasurement)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.ORGAN_MEASUREMENT__ORGAN_MEASUREMENT_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OrganMeasurementOrganMeasurementSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(organMeasurement, context) }),
						 new Object [] { organMeasurement }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(OrganMeasurement) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(OrganMeasurement) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(68));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(organMeasurement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSpecimenInformation(OrganMeasurement) <em>Get Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::SpecimenInformation))->asSequence()->any(true).oclAsType(sdtm::SpecimenInformation)";

	/**
	 * The cached OCL query for the '{@link #getSpecimenInformation(OrganMeasurement) <em>Get Specimen Information</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SpecimenInformation getSpecimenInformation(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(69));
			try {
				GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
		return (SpecimenInformation) query.evaluate(organMeasurement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(OrganMeasurement) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(OrganMeasurement) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(70));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(organMeasurement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComment(OrganMeasurement) <em>Get Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment))->asSequence()->any(true).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComment(OrganMeasurement) <em>Get Comment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Comment getComment(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_COMMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(71));
			try {
				GET_COMMENT__EOCL_QRY = helper.createQuery(GET_COMMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENT__EOCL_QRY);
		return (Comment) query.evaluate(organMeasurement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(OrganMeasurement) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(OrganMeasurement) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(72));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(organMeasurement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getExclusionReason(OrganMeasurement) <em>Get Exclusion Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionReason(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ExclusionReason))->asSequence()->any(true).oclAsType(sdtm::ExclusionReason)";

	/**
	 * The cached OCL query for the '{@link #getExclusionReason(OrganMeasurement) <em>Get Exclusion Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionReason(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExclusionReason getExclusionReason(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_EXCLUSION_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(73));
			try {
				GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
		return (ExclusionReason) query.evaluate(organMeasurement);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(OrganMeasurement) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(OrganMeasurement) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(74));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(organMeasurement);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(OrganMeasurement) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(OrganMeasurement) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(OrganMeasurement)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(OrganMeasurement organMeasurement) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.ORGAN_MEASUREMENT, SdtmPackage.Literals.ORGAN_MEASUREMENT.getEAllOperations().get(75));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(organMeasurement);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

} // OrganMeasurementOperations