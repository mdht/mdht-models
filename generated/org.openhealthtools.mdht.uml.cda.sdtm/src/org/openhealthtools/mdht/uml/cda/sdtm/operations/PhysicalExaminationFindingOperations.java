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
import org.openhealthtools.mdht.uml.cda.sdtm.BodySystemorOrganClass;
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Examination Finding</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingBodySystemorOrganClass(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingStudyFindingEvaluator(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Study Finding Evaluator</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#validatePhysicalExaminationFindingFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getBodySystemorOrganClass() <em>Get Body Systemor Organ Class</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.PhysicalExaminationFinding#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExaminationFindingOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected PhysicalExaminationFindingOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.67')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingTemplateId(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingClassCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingMoodCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingId(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingId(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingCodeP(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'unknown' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingStatusCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingValue(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingMethodCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingMethodCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingMethodCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingMethodCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingMethodCodeP(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingMethodCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingTargetSiteCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingTargetSiteCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingTargetSiteCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingTargetSiteCodeP(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingTargetSiteCodeP(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingTargetSiteCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingTargetSiteCode(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_TARGET_SITE_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingTargetSiteCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingGroupIdentifier(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::BodySystemorOrganClass) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Body Systemor Organ Class</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingBodySystemorOrganClass(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_BODY_SYSTEMOR_ORGAN_CLASS,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingBodySystemorOrganClass", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingNonPerformanceReason(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingStudyFindingEvaluator(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Study Finding Evaluator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingStudyFindingEvaluator(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyFindingEvaluator))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingStudyFindingEvaluator(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Study Finding Evaluator</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingStudyFindingEvaluator(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingStudyFindingEvaluator(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_STUDY_FINDING_EVALUATOR,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingStudyFindingEvaluator", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingDataCollection(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingComment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingComment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingComment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingComment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingComment(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingDomainAssignment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingDomainAssignment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingDomainAssignment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingDomainAssignment(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingDomainAssignment(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingRelatedRecord(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingRelatedRecord(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingRelatedRecord(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingRelatedRecord(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingRelatedRecord(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingSupplementalValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingSupplementalValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingSupplementalValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingSupplementalValue(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingSupplementalValue(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingCategory(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingSubCategory(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingSubCategory(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExaminationFindingFindingAbout(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingFindingAbout(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExaminationFindingFindingAbout(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Examination Finding Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExaminationFindingFindingAbout(PhysicalExaminationFinding, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExaminationFinding The receiving '<em><b>Physical Examination Finding</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhysicalExaminationFindingFindingAbout(PhysicalExaminationFinding physicalExaminationFinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING);
			try {
				VALIDATE_PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(physicalExaminationFinding)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.PHYSICAL_EXAMINATION_FINDING__PHYSICAL_EXAMINATION_FINDING_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhysicalExaminationFindingPhysicalExaminationFindingFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(physicalExaminationFinding, context) }),
						 new Object [] { physicalExaminationFinding }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(PhysicalExaminationFinding) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(PhysicalExaminationFinding) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(75));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBodySystemorOrganClass(PhysicalExaminationFinding) <em>Get Body Systemor Organ Class</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::BodySystemorOrganClass))->asSequence()->any(true).oclAsType(sdtm::BodySystemorOrganClass)";

	/**
	 * The cached OCL query for the '{@link #getBodySystemorOrganClass(PhysicalExaminationFinding) <em>Get Body Systemor Organ Class</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodySystemorOrganClass(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  BodySystemorOrganClass getBodySystemorOrganClass(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(76));
			try {
				GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY = helper.createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_BODY_SYSTEMOR_ORGAN_CLASS__EOCL_QRY);
		return (BodySystemorOrganClass) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(PhysicalExaminationFinding) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(PhysicalExaminationFinding) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(77));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(PhysicalExaminationFinding) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(PhysicalExaminationFinding) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(78));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(PhysicalExaminationFinding) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(PhysicalExaminationFinding) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(79));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(physicalExaminationFinding);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(PhysicalExaminationFinding) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(PhysicalExaminationFinding) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(80));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(PhysicalExaminationFinding) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(PhysicalExaminationFinding) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(81));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(physicalExaminationFinding);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(PhysicalExaminationFinding) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(PhysicalExaminationFinding) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(82));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(physicalExaminationFinding);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(PhysicalExaminationFinding) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(PhysicalExaminationFinding) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(83));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(PhysicalExaminationFinding) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(PhysicalExaminationFinding) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(84));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(physicalExaminationFinding);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(PhysicalExaminationFinding) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(PhysicalExaminationFinding) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(PhysicalExaminationFinding)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(PhysicalExaminationFinding physicalExaminationFinding) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING, SdtmPackage.Literals.PHYSICAL_EXAMINATION_FINDING.getEAllOperations().get(85));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(physicalExaminationFinding);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // PhysicalExaminationFindingOperations