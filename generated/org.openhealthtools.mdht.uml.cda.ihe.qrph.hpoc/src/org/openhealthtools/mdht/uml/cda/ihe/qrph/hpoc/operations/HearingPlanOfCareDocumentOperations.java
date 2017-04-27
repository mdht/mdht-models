/**
 */
package org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPackage;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HPOCPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingScreeningSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProblemsSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.ProcedureSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.RiskIndicatorsForHearingLossSection;
import org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.util.HPOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hearing Plan Of Care Document</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentTypeIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentSetIdAndVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Set Id And Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentSetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Set Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentVersionNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Version Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentHearingPlanOfCareSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Hearing Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentHearingScreeningSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Hearing Screening Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Risk Indicators For Hearing Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentProblemsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareDocumentProcedureSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#getHearingPlanOfCareSection() <em>Get Hearing Plan Of Care Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#getHearingScreeningSection() <em>Get Hearing Screening Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#getRiskIndicatorsForHearingLossSection() <em>Get Risk Indicators For Hearing Loss Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#getProblemsSection() <em>Get Problems Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#getProcedureSection() <em>Get Procedure Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.qrph.hpoc.HearingPlanOfCareDocument#validateHearingPlanOfCareHeaderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HearingPlanOfCareDocumentOperations extends HearingPlanOfCareHeaderOperations
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
  protected HearingPlanOfCareDocumentOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentTypeIdRoot(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id Root</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTypeIdRoot(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeId.oclIsUndefined() and self.typeId.root = '2.16.840.1.113883.1.3'";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentTypeIdRoot(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTypeIdRoot(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentTypeIdRoot(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_ROOT,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentTypeIdRoot"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentTypeIdExtension(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTypeIdExtension(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.typeId.oclIsUndefined() and self.typeId.extension = 'POCD_HD000040'";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentTypeIdExtension(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTypeIdExtension(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentTypeIdExtension(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID_EXTENSION,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentTypeIdExtension"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentSetIdAndVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Set Id And Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentSetIdAndVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() and self.versionNumber.oclIsUndefined())"+
"   xor (not self.setId.oclIsUndefined() and not self.versionNumber.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentSetIdAndVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Set Id And Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentSetIdAndVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentSetIdAndVersionNumber(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID_AND_VERSION_NUMBER,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentSetIdAndVersionNumber"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentRealmCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentRealmCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = element.oclAsType(datatypes::CS) in "+
"value.code = 'US'))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentRealmCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentRealmCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentRealmCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentRealmCode"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentRealmCodeP(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Realm Code P</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentRealmCodeP(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentRealmCodeP(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Realm Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentRealmCodeP(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentRealmCodeP(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_REALM_CODE_P,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentRealmCodeP"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentTypeId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTypeId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentTypeId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTypeId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentTypeId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TYPE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentTypeId"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentId"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '34817-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentCode"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentTitle(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Title</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTitle(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'Hearing Screening Evaluation and Management Note')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentTitle(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentTitle(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentTitle(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_TITLE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentTitle"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentEffectiveTime(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentEffectiveTime(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentEffectiveTime(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentEffectiveTime(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentEffectiveTime(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_EFFECTIVE_TIME,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentEffectiveTime"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentConfidentialityCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentConfidentialityCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.25' and (value.code = 'N' or value.code = 'R' or value.code = 'V'))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentConfidentialityCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentConfidentialityCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentConfidentialityCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_CONFIDENTIALITY_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentConfidentialityCode"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentLanguageCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentLanguageCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "+
"not value.code.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentLanguageCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentLanguageCode(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentLanguageCode(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_LANGUAGE_CODE,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentLanguageCode"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentSetId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Set Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentSetId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.setId.oclIsUndefined() or self.setId.isNullFlavorUndefined()) implies (not self.setId.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentSetId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Set Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentSetId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentSetId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_SET_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentSetId"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Version Number</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.versionNumber.oclIsUndefined() or self.versionNumber.isNullFlavorUndefined()) implies (not self.versionNumber.oclIsUndefined())";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Version Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentVersionNumber(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentVersionNumber(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_VERSION_NUMBER,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentVersionNumber"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentHearingPlanOfCareSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Hearing Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentHearingPlanOfCareSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::HearingPlanOfCareSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentHearingPlanOfCareSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Hearing Plan Of Care Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentHearingPlanOfCareSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentHearingPlanOfCareSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_PLAN_OF_CARE_SECTION,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentHearingPlanOfCareSection"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentHearingScreeningSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Hearing Screening Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentHearingScreeningSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::HearingScreeningSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentHearingScreeningSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Hearing Screening Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentHearingScreeningSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentHearingScreeningSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_HEARING_SCREENING_SECTION,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentHearingScreeningSection"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Risk Indicators For Hearing Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::RiskIndicatorsForHearingLossSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Risk Indicators For Hearing Loss Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentRiskIndicatorsForHearingLossSection"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentProblemsSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Problems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentProblemsSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::ProblemsSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentProblemsSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Problems Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentProblemsSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentProblemsSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_PROBLEMS_SECTION,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentProblemsSection"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareDocumentProcedureSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentProcedureSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::ProcedureSection))";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareDocumentProcedureSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Document Procedure Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareDocumentProcedureSection(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareDocumentProcedureSection(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_DOCUMENT_PROCEDURE_SECTION,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareDocumentProcedureSection"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

  /**
	 * The cached OCL expression body for the '{@link #getHearingPlanOfCareSection(HearingPlanOfCareDocument) <em>Get Hearing Plan Of Care Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHearingPlanOfCareSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HEARING_PLAN_OF_CARE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::HearingPlanOfCareSection))->asSequence()->any(true).oclAsType(hpoc::HearingPlanOfCareSection)";

  /**
	 * The cached OCL query for the '{@link #getHearingPlanOfCareSection(HearingPlanOfCareDocument) <em>Get Hearing Plan Of Care Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHearingPlanOfCareSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HEARING_PLAN_OF_CARE_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  public static  HearingPlanOfCareSection getHearingPlanOfCareSection(HearingPlanOfCareDocument hearingPlanOfCareDocument)
  {
	
	
	
		if (GET_HEARING_PLAN_OF_CARE_SECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT, HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT.getEAllOperations().get(54));
			try {
				GET_HEARING_PLAN_OF_CARE_SECTION__EOCL_QRY = helper.createQuery(GET_HEARING_PLAN_OF_CARE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HEARING_PLAN_OF_CARE_SECTION__EOCL_QRY);
		return (HearingPlanOfCareSection) query.evaluate(hearingPlanOfCareDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getHearingScreeningSection(HearingPlanOfCareDocument) <em>Get Hearing Screening Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHearingScreeningSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_HEARING_SCREENING_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::HearingScreeningSection))->asSequence()->any(true).oclAsType(hpoc::HearingScreeningSection)";

  /**
	 * The cached OCL query for the '{@link #getHearingScreeningSection(HearingPlanOfCareDocument) <em>Get Hearing Screening Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getHearingScreeningSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_HEARING_SCREENING_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  public static  HearingScreeningSection getHearingScreeningSection(HearingPlanOfCareDocument hearingPlanOfCareDocument)
  {
	
	
	
		if (GET_HEARING_SCREENING_SECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT, HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT.getEAllOperations().get(55));
			try {
				GET_HEARING_SCREENING_SECTION__EOCL_QRY = helper.createQuery(GET_HEARING_SCREENING_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_HEARING_SCREENING_SECTION__EOCL_QRY);
		return (HearingScreeningSection) query.evaluate(hearingPlanOfCareDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument) <em>Get Risk Indicators For Hearing Loss Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::RiskIndicatorsForHearingLossSection))->asSequence()->any(true).oclAsType(hpoc::RiskIndicatorsForHearingLossSection)";

  /**
	 * The cached OCL query for the '{@link #getRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument) <em>Get Risk Indicators For Hearing Loss Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  public static  RiskIndicatorsForHearingLossSection getRiskIndicatorsForHearingLossSection(HearingPlanOfCareDocument hearingPlanOfCareDocument)
  {
	
	
	
		if (GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT, HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT.getEAllOperations().get(56));
			try {
				GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY = helper.createQuery(GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_RISK_INDICATORS_FOR_HEARING_LOSS_SECTION__EOCL_QRY);
		return (RiskIndicatorsForHearingLossSection) query.evaluate(hearingPlanOfCareDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProblemsSection(HearingPlanOfCareDocument) <em>Get Problems Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemsSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROBLEMS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::ProblemsSection))->asSequence()->any(true).oclAsType(hpoc::ProblemsSection)";

  /**
	 * The cached OCL query for the '{@link #getProblemsSection(HearingPlanOfCareDocument) <em>Get Problems Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProblemsSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROBLEMS_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  public static  ProblemsSection getProblemsSection(HearingPlanOfCareDocument hearingPlanOfCareDocument)
  {
	
	
	
		if (GET_PROBLEMS_SECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT, HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT.getEAllOperations().get(57));
			try {
				GET_PROBLEMS_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEMS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROBLEMS_SECTION__EOCL_QRY);
		return (ProblemsSection) query.evaluate(hearingPlanOfCareDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #getProcedureSection(HearingPlanOfCareDocument) <em>Get Procedure Section</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcedureSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static final String GET_PROCEDURE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(hpoc::ProcedureSection))->asSequence()->any(true).oclAsType(hpoc::ProcedureSection)";

  /**
	 * The cached OCL query for the '{@link #getProcedureSection(HearingPlanOfCareDocument) <em>Get Procedure Section</em>}' query operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getProcedureSection(HearingPlanOfCareDocument)
	 * @generated
	 * @ordered
	 */
  protected static OCLExpression<EClassifier> GET_PROCEDURE_SECTION__EOCL_QRY;


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  
  public static  ProcedureSection getProcedureSection(HearingPlanOfCareDocument hearingPlanOfCareDocument)
  {
	
	
	
		if (GET_PROCEDURE_SECTION__EOCL_QRY == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT, HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT.getEAllOperations().get(58));
			try {
				GET_PROCEDURE_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURE_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		OCL.Query query = EOCL_ENV.get().createQuery(GET_PROCEDURE_SECTION__EOCL_QRY);
		return (ProcedureSection) query.evaluate(hearingPlanOfCareDocument);
	}

  /**
	 * The cached OCL expression body for the '{@link #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.7.3.1.1.26.2.1')";

  /**
	 * The cached OCL invariant for the '{@link #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hearing Plan Of Care Header Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareDocument, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static ThreadLocal<  Constraint> VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();


  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hearingPlanOfCareDocument The receiving '<em><b>Hearing Plan Of Care Document</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateHearingPlanOfCareHeaderTemplateId(HearingPlanOfCareDocument hearingPlanOfCareDocument, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HPOCPackage.Literals.HEARING_PLAN_OF_CARE_DOCUMENT);
			try {
				VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(hearingPlanOfCareDocument)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HPOCValidator.DIAGNOSTIC_SOURCE,
						 HPOCValidator.HEARING_PLAN_OF_CARE_DOCUMENT__HEARING_PLAN_OF_CARE_HEADER_TEMPLATE_ID,
						 HPOCPlugin.INSTANCE.getString("HearingPlanOfCareDocumentHearingPlanOfCareHeaderTemplateId"),
						 new Object [] { hearingPlanOfCareDocument }));
			}
			 
			return false;
		}
		return true;
	}

} // HearingPlanOfCareDocumentOperations