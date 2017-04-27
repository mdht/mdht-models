/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

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
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection#validateHearingPlanOfCareProblemsSubSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection#validateHearingPlanOfCareProblemsSubSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection#validateHearingPlanOfCareProblemsSubSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection#validateHearingPlanOfCareProblemsSubSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection#validateHearingPlanOfCareProblemsSubSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareProblemsSubSection#validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Entry Hpoc Problem Concern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareProblemsSubSectionOperations extends SectionOperations
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
  protected HearingPlanOfCareProblemsSubSectionOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemsSubSectionTemplateId(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionTemplateId(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.3.5')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemsSubSectionTemplateId(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionTemplateId(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProblemsSubSection The receiving '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProblemsSubSectionTemplateId(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProblemsSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemsSubSectionHearingPlanOfCareProblemsSubSectionTemplateId"),
						 new Object [] { hearingPlanOfCareProblemsSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemsSubSectionCode(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionCode(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '11450-4-HPOC' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemsSubSectionCode(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionCode(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProblemsSubSection The receiving '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProblemsSubSectionCode(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProblemsSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemsSubSectionHearingPlanOfCareProblemsSubSectionCode"),
						 new Object [] { hearingPlanOfCareProblemsSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemsSubSectionCodeP(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionCodeP(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemsSubSectionCodeP(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionCodeP(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProblemsSubSection The receiving '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProblemsSubSectionCodeP(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProblemsSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemsSubSectionHearingPlanOfCareProblemsSubSectionCodeP"),
						 new Object [] { hearingPlanOfCareProblemsSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemsSubSectionText(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionText(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemsSubSectionText(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionText(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProblemsSubSection The receiving '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProblemsSubSectionText(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProblemsSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TEXT,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemsSubSectionHearingPlanOfCareProblemsSubSectionText"),
						 new Object [] { hearingPlanOfCareProblemsSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemsSubSectionTitle(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionTitle(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemsSubSectionTitle(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionTitle(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProblemsSubSection The receiving '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProblemsSubSectionTitle(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProblemsSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_TITLE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemsSubSectionHearingPlanOfCareProblemsSubSectionTitle"),
						 new Object [] { hearingPlanOfCareProblemsSubSection }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Entry Hpoc Problem Concern</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.oclIsUndefined() and entry.oclIsKindOf(cda::Entry))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Problems Sub Section Entry Hpoc Problem Concern</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(HearingPlanOfCareProblemsSubSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareProblemsSubSection The receiving '<em><b>Hearing Plan Of Care Problems Sub Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern(HearingPlanOfCareProblemsSubSection hearingPlanOfCareProblemsSubSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareProblemsSubSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION__HEARING_PLAN_OF_CARE_PROBLEMS_SUB_SECTION_ENTRY_HPOC_PROBLEM_CONCERN,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareProblemsSubSectionHearingPlanOfCareProblemsSubSectionEntryHpocProblemConcern"),
						 new Object [] { hearingPlanOfCareProblemsSubSection }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingPlanOfCareProblemsSubSectionOperations