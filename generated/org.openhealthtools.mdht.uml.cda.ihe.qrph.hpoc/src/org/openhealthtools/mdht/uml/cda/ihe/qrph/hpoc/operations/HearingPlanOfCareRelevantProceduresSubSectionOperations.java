/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSection#validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Act</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareRelevantProceduresSubSectionOperations extends SectionOperations
{
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
  protected HearingPlanOfCareRelevantProceduresSubSectionOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.7')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionTemplateId(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionTemplateId"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionCodeP(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionCodeP"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSectionCodeP", passToken);
				}
				passToken.add(hearingPlanOfCareRelevantProceduresSubSection);
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionCode(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionCode(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '47519-4-HPOC' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionCode(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionCode(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionCode(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareRelevantProceduresSubSectionCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(hearingPlanOfCareRelevantProceduresSubSection)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionCode"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionText(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionText(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionText(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionText(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionText(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TEXT,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionText"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionTitle(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionTitle(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionTitle(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionTitle(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionTitle(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_TITLE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionTitle"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_PROCEDURE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionEntryProcedure"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Act</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Relevant Procedures Sub Section Entry Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(HearingPlanOfCareRelevantProceduresSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareRelevantProceduresSubSection The receiving '<em><b>Hearing Plan Of Care Relevant Procedures Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareRelevantProceduresSubSectionEntryAct(HearingPlanOfCareRelevantProceduresSubSection hearingPlanOfCareRelevantProceduresSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareRelevantProceduresSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION__HEARING_PLAN_OF_CARE_RELEVANT_PROCEDURES_SUB_SECTION_ENTRY_ACT,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareRelevantProceduresSubSectionHearingPlanOfCareRelevantProceduresSubSectionEntryAct"),
						 new Object [] { hearingPlanOfCareRelevantProceduresSubSection }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingPlanOfCareRelevantProceduresSubSectionOperations