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
import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.EventStudyDay;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.GroupIdentifier;
import org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility;
import org.openhealthtools.mdht.uml.cda.sdtm.NonPerformanceReason;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.ResultCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;
import org.openhealthtools.mdht.uml.cda.sdtm.TimingReference;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Microbiology Susceptibility</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityInterpretationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityEventStudyDay(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityTimingReference(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityGroupIdentifier(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityStudyTestPerformer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Study Test Performer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityNonPerformanceReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitySupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilitySubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityResultCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#validateMicrobiologySusceptibilityFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getEventStudyDay() <em>Get Event Study Day</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getTimingReference() <em>Get Timing Reference</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getGroupIdentifier() <em>Get Group Identifier</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getNonPerformanceReason() <em>Get Non Performance Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getResultCategory() <em>Get Result Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.MicrobiologySusceptibility#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MicrobiologySusceptibilityOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected MicrobiologySusceptibilityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.54')";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityTemplateId(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityClassCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityMoodCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityId(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityId(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityCodeP(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityStatusCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_STATUS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityStatusCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityEffectiveTime(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityValue(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMethodCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityMethodCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMethodCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityMethodCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityMethodCodeP(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityMethodCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityMethodCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_METHOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityMethodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityInterpretationCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityInterpretationCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityInterpretationCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityInterpretationCodeP(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityInterpretationCodeP(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityInterpretationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityInterpretationCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityInterpretationCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (self.interpretationCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'CXXXXX' or value.code = 'CXXXXX' or value.code = 'CXXXXX')))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityInterpretationCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityInterpretationCode(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityInterpretationCode(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_INTERPRETATION_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityInterpretationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::EventStudyDay) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Event Study Day</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityEventStudyDay(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_EVENT_STUDY_DAY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityEventStudyDay", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::TimingReference) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Timing Reference</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityTimingReference(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_TIMING_REFERENCE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityTimingReference", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::GroupIdentifier) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Group Identifier</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityGroupIdentifier(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_GROUP_IDENTIFIER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityGroupIdentifier", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityStudyTestPerformer(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Study Test Performer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityStudyTestPerformer(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(sdtm::StudyTestOrganization))";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityStudyTestPerformer(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Study Test Performer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityStudyTestPerformer(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityStudyTestPerformer(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_STUDY_TEST_PERFORMER,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityStudyTestPerformer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::NonPerformanceReason) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Non Performance Reason</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityNonPerformanceReason(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_NON_PERFORMANCE_REASON,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityNonPerformanceReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityComment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityComment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityComment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityComment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityComment(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityDomainAssignment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityDomainAssignment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityDomainAssignment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityDomainAssignment(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityDomainAssignment(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityRelatedRecord(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityRelatedRecord(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityRelatedRecord(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityRelatedRecord(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityRelatedRecord(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilitySupplementalValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilitySupplementalValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilitySupplementalValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilitySupplementalValue(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilitySupplementalValue(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilitySupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityCategory(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilitySubCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilitySubCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilitySubCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilitySubCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilitySubCategory(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilitySubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityResultCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityResultCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::ResultCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityResultCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Result Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityResultCategory(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityResultCategory(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_RESULT_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityResultCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMicrobiologySusceptibilityFindingAbout(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityFindingAbout(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateMicrobiologySusceptibilityFindingAbout(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Microbiology Susceptibility Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMicrobiologySusceptibilityFindingAbout(MicrobiologySusceptibility, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param microbiologySusceptibility The receiving '<em><b>Microbiology Susceptibility</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMicrobiologySusceptibilityFindingAbout(MicrobiologySusceptibility microbiologySusceptibility, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY);
			try {
				VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(microbiologySusceptibility)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.MICROBIOLOGY_SUSCEPTIBILITY__MICROBIOLOGY_SUSCEPTIBILITY_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MicrobiologySusceptibilityMicrobiologySusceptibilityFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(microbiologySusceptibility, context) }),
						 new Object [] { microbiologySusceptibility }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEventStudyDay(MicrobiologySusceptibility) <em>Get Event Study Day</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStudyDay(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EVENT_STUDY_DAY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::EventStudyDay))->asSequence()->any(true).oclAsType(sdtm::EventStudyDay)";

	/**
	 * The cached OCL query for the '{@link #getEventStudyDay(MicrobiologySusceptibility) <em>Get Event Study Day</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventStudyDay(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EVENT_STUDY_DAY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EventStudyDay getEventStudyDay(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_EVENT_STUDY_DAY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(77));
			try {
				GET_EVENT_STUDY_DAY__EOCL_QRY = helper.createQuery(GET_EVENT_STUDY_DAY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_EVENT_STUDY_DAY__EOCL_QRY);
		return (EventStudyDay) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getTimingReference(MicrobiologySusceptibility) <em>Get Timing Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TIMING_REFERENCE__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::TimingReference))->asSequence()->any(true).oclAsType(sdtm::TimingReference)";

	/**
	 * The cached OCL query for the '{@link #getTimingReference(MicrobiologySusceptibility) <em>Get Timing Reference</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimingReference(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TIMING_REFERENCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  TimingReference getTimingReference(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_TIMING_REFERENCE__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(78));
			try {
				GET_TIMING_REFERENCE__EOCL_QRY = helper.createQuery(GET_TIMING_REFERENCE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_TIMING_REFERENCE__EOCL_QRY);
		return (TimingReference) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGroupIdentifier(MicrobiologySusceptibility) <em>Get Group Identifier</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GROUP_IDENTIFIER__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::GroupIdentifier))->asSequence()->any(true).oclAsType(sdtm::GroupIdentifier)";

	/**
	 * The cached OCL query for the '{@link #getGroupIdentifier(MicrobiologySusceptibility) <em>Get Group Identifier</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupIdentifier(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GROUP_IDENTIFIER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  GroupIdentifier getGroupIdentifier(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_GROUP_IDENTIFIER__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(79));
			try {
				GET_GROUP_IDENTIFIER__EOCL_QRY = helper.createQuery(GET_GROUP_IDENTIFIER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_GROUP_IDENTIFIER__EOCL_QRY);
		return (GroupIdentifier) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNonPerformanceReason(MicrobiologySusceptibility) <em>Get Non Performance Reason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NON_PERFORMANCE_REASON__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::NonPerformanceReason))->asSequence()->any(true).oclAsType(sdtm::NonPerformanceReason)";

	/**
	 * The cached OCL query for the '{@link #getNonPerformanceReason(MicrobiologySusceptibility) <em>Get Non Performance Reason</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNonPerformanceReason(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NON_PERFORMANCE_REASON__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  NonPerformanceReason getNonPerformanceReason(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_NON_PERFORMANCE_REASON__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(80));
			try {
				GET_NON_PERFORMANCE_REASON__EOCL_QRY = helper.createQuery(GET_NON_PERFORMANCE_REASON__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_NON_PERFORMANCE_REASON__EOCL_QRY);
		return (NonPerformanceReason) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(MicrobiologySusceptibility) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(MicrobiologySusceptibility) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_COMMENTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(81));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(microbiologySusceptibility);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(MicrobiologySusceptibility) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(MicrobiologySusceptibility) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(82));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(MicrobiologySusceptibility) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(MicrobiologySusceptibility) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(83));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(microbiologySusceptibility);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(MicrobiologySusceptibility) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(MicrobiologySusceptibility) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(84));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(microbiologySusceptibility);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(MicrobiologySusceptibility) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(MicrobiologySusceptibility) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(85));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(MicrobiologySusceptibility) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(MicrobiologySusceptibility) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(86));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultCategory(MicrobiologySusceptibility) <em>Get Result Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCategory(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULT_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::ResultCategory))->asSequence()->any(true).oclAsType(sdtm::ResultCategory)";

	/**
	 * The cached OCL query for the '{@link #getResultCategory(MicrobiologySusceptibility) <em>Get Result Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCategory(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULT_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  ResultCategory getResultCategory(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_RESULT_CATEGORY__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(87));
			try {
				GET_RESULT_CATEGORY__EOCL_QRY = helper.createQuery(GET_RESULT_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RESULT_CATEGORY__EOCL_QRY);
		return (ResultCategory) query.evaluate(microbiologySusceptibility);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(MicrobiologySusceptibility) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(MicrobiologySusceptibility) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(MicrobiologySusceptibility)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(MicrobiologySusceptibility microbiologySusceptibility) {
	
	
	
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY, SdtmPackage.Literals.MICROBIOLOGY_SUSCEPTIBILITY.getEAllOperations().get(88));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(microbiologySusceptibility);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // MicrobiologySusceptibilityOperations