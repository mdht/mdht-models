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
import org.openhealthtools.mdht.uml.cda.sdtm.AssayQuantitation;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.ExclusionReason;
import org.openhealthtools.mdht.uml.cda.sdtm.FastingStatus;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.PlannedStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SpecimenInformation;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pharmacokinetic Concentration Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingSpecimenInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingStudyTestPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Study Test Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingPlannedStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingExclusionReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingFastingStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingAssayQuantitation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#validatePharmacokineticConcentrationFindingFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getSpecimenInformation() <em>Get Specimen Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getPlannedStudyDay() <em>Get Planned Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getExclusionReason() <em>Get Exclusion Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getFastingStatus() <em>Get Fasting Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getAssayQuantitation() <em>Get Assay Quantitation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PharmacokineticConcentrationFinding#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PharmacokineticConcentrationFindingOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected PharmacokineticConcentrationFindingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.65')";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingTemplateId(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingClassCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingMoodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingId(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingCodeP(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingStatusCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingMethodCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingMethodCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingMethodCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingMethodCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingMethodCodeP(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingMethodCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingInterpretationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingInterpretationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingInterpretationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingInterpretationCodeP(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingInterpretationCodeP(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingInterpretationCode(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingGroupIdentifier(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.procedure.oclIsUndefined() and entryRelationship.procedure.oclIsKindOf(sdtm::SpecimenInformation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Specimen Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingSpecimenInformation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_SPECIMEN_INFORMATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingSpecimenInformation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingNonPerformanceReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingStudyTestPerformer(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Study Test Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingStudyTestPerformer(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyTestOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingStudyTestPerformer(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Study Test Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingStudyTestPerformer(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingStudyTestPerformer(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_STUDY_TEST_PERFORMER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingStudyTestPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::PlannedStudyDay) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Planned Study Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingPlannedStudyDay(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_PLANNED_STUDY_DAY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingPlannedStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ExclusionReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Exclusion Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingExclusionReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_EXCLUSION_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingExclusionReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingComment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingComment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingComment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingComment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingComment(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingDomainAssignment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingDomainAssignment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingDomainAssignment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingDomainAssignment(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingDomainAssignment(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingRelatedRecord(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingRelatedRecord(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingRelatedRecord(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingRelatedRecord(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingRelatedRecord(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingSupplementalValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingSupplementalValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingSupplementalValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingSupplementalValue(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingSupplementalValue(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingCategory(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingSubCategory(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingSubCategory(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FastingStatus) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Fasting Status</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingFastingStatus(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingFastingStatus(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_FASTING_STATUS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingFastingStatus", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingAssayQuantitation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingAssayQuantitation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::AssayQuantitation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingAssayQuantitation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Assay Quantitation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingAssayQuantitation(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingAssayQuantitation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_ASSAY_QUANTITATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingAssayQuantitation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePharmacokineticConcentrationFindingFindingAbout(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingFindingAbout(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePharmacokineticConcentrationFindingFindingAbout(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pharmacokinetic Concentration Finding Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePharmacokineticConcentrationFindingFindingAbout(PharmacokineticConcentrationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pharmacokineticConcentrationFinding The receiving '<em><b>Pharmacokinetic Concentration Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePharmacokineticConcentrationFindingFindingAbout(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING);
			try {
				VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pharmacokineticConcentrationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHARMACOKINETIC_CONCENTRATION_FINDING__PHARMACOKINETIC_CONCENTRATION_FINDING_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PharmacokineticConcentrationFindingPharmacokineticConcentrationFindingFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pharmacokineticConcentrationFinding, context) }),
						 new Object [] { pharmacokineticConcentrationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(PharmacokineticConcentrationFinding) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(PharmacokineticConcentrationFinding) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(78));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSpecimenInformation(PharmacokineticConcentrationFinding) <em>Get Specimen Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SPECIMEN_INFORMATION__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(sdtm::SpecimenInformation))->asSequence()->any(true).oclAsType(sdtm::SpecimenInformation)";

	/**
	 * The cached OCL query for the '{@link #getSpecimenInformation(PharmacokineticConcentrationFinding) <em>Get Specimen Information</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecimenInformation(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SPECIMEN_INFORMATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SpecimenInformation getSpecimenInformation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_SPECIMEN_INFORMATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(79));
			try {
				GET_SPECIMEN_INFORMATION__EOCL_QRY = helper.createQuery(GET_SPECIMEN_INFORMATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SPECIMEN_INFORMATION__EOCL_QRY);
		return (SpecimenInformation) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(PharmacokineticConcentrationFinding) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(PharmacokineticConcentrationFinding) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(80));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlannedStudyDay(PharmacokineticConcentrationFinding) <em>Get Planned Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStudyDay(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLANNED_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::PlannedStudyDay))->asSequence()->any(true).oclAsType(sdtm::PlannedStudyDay)";

	/**
	 * The cached OCL query for the '{@link #getPlannedStudyDay(PharmacokineticConcentrationFinding) <em>Get Planned Study Day</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlannedStudyDay(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLANNED_STUDY_DAY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  PlannedStudyDay getPlannedStudyDay(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_PLANNED_STUDY_DAY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(81));
			try {
				GET_PLANNED_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_PLANNED_STUDY_DAY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLANNED_STUDY_DAY__EOCL_QRY);
		return (PlannedStudyDay) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getExclusionReason(PharmacokineticConcentrationFinding) <em>Get Exclusion Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionReason(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXCLUSION_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ExclusionReason))->asSequence()->any(true).oclAsType(sdtm::ExclusionReason)";

	/**
	 * The cached OCL query for the '{@link #getExclusionReason(PharmacokineticConcentrationFinding) <em>Get Exclusion Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusionReason(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXCLUSION_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ExclusionReason getExclusionReason(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_EXCLUSION_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(82));
			try {
				GET_EXCLUSION_REASON__EOCL_QRY = helper.createQuery(GET_EXCLUSION_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EXCLUSION_REASON__EOCL_QRY);
		return (ExclusionReason) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(PharmacokineticConcentrationFinding) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(PharmacokineticConcentrationFinding) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(83));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(pharmacokineticConcentrationFinding);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(PharmacokineticConcentrationFinding) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(PharmacokineticConcentrationFinding) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(84));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(PharmacokineticConcentrationFinding) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(PharmacokineticConcentrationFinding) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(85));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(pharmacokineticConcentrationFinding);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(PharmacokineticConcentrationFinding) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(PharmacokineticConcentrationFinding) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(86));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(pharmacokineticConcentrationFinding);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(PharmacokineticConcentrationFinding) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(PharmacokineticConcentrationFinding) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(87));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(PharmacokineticConcentrationFinding) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(PharmacokineticConcentrationFinding) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(88));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFastingStatus(PharmacokineticConcentrationFinding) <em>Get Fasting Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatus(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FASTING_STATUS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FastingStatus))->asSequence()->any(true).oclAsType(sdtm::FastingStatus)";

	/**
	 * The cached OCL query for the '{@link #getFastingStatus(PharmacokineticConcentrationFinding) <em>Get Fasting Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFastingStatus(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FASTING_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  FastingStatus getFastingStatus(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_FASTING_STATUS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(89));
			try {
				GET_FASTING_STATUS__EOCL_QRY = helper.createQuery(GET_FASTING_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FASTING_STATUS__EOCL_QRY);
		return (FastingStatus) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAssayQuantitation(PharmacokineticConcentrationFinding) <em>Get Assay Quantitation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssayQuantitation(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ASSAY_QUANTITATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::AssayQuantitation))->asSequence()->any(true).oclAsType(sdtm::AssayQuantitation)";

	/**
	 * The cached OCL query for the '{@link #getAssayQuantitation(PharmacokineticConcentrationFinding) <em>Get Assay Quantitation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssayQuantitation(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ASSAY_QUANTITATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  AssayQuantitation getAssayQuantitation(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_ASSAY_QUANTITATION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(90));
			try {
				GET_ASSAY_QUANTITATION__EOCL_QRY = helper.createQuery(GET_ASSAY_QUANTITATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_ASSAY_QUANTITATION__EOCL_QRY);
		return (AssayQuantitation) query.evaluate(pharmacokineticConcentrationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(PharmacokineticConcentrationFinding) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(PharmacokineticConcentrationFinding) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(PharmacokineticConcentrationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(PharmacokineticConcentrationFinding pharmacokineticConcentrationFinding) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING, SdtmPackage.Literals.PHARMACOKINETIC_CONCENTRATION_FINDING.getEAllOperations().get(91));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(pharmacokineticConcentrationFinding);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // PharmacokineticConcentrationFindingOperations