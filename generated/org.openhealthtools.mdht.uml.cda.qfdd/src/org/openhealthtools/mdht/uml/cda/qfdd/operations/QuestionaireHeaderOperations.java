/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalDocumentOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Questionaire Header</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderConfidentialityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Confidentiality Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderConfidentialityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Confidentiality Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Language Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderLanguageCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Language Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderRealmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Realm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderRealmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Realm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderTypeId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderRecordTarget(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderTypeIdExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderTypeIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Authoring Device Manufacturer Model Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Authoring Device Software Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Assigned Authoring Device</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Represented Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderAuthorTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Telecom</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Represented Custodian Organization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderCustodianAssignedCustodian(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role II Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderRecordTargetPatientRoleId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeader#validateQuestionaireHeaderRecordTargetPatientRole(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QuestionaireHeaderOperations extends ClinicalDocumentOperations {
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
	protected QuestionaireHeaderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderTemplateId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTemplateId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderTemplateId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTemplateId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderTemplateId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderTemplateId"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderCodeP(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCodeP"),
						 new Object [] { questionaireHeader }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeaderCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeaderCodeP", passToken);
				}
				passToken.add(questionaireHeader);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderCode(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeaderCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(questionaireHeader)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCode"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderConfidentialityCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Confidentiality Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderConfidentialityCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderConfidentialityCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Confidentiality Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderConfidentialityCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderConfidentialityCodeP(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderConfidentialityCodeP"),
						 new Object [] { questionaireHeader }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeaderConfidentialityCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeaderConfidentialityCodeP", passToken);
				}
				passToken.add(questionaireHeader);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderConfidentialityCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderConfidentialityCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.confidentialityCode.oclIsUndefined() or self.confidentialityCode.isNullFlavorUndefined()) implies (not self.confidentialityCode.oclIsUndefined() and self.confidentialityCode.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.confidentialityCode.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.5.25' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderConfidentialityCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Confidentiality Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderConfidentialityCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderConfidentialityCode(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.qfdd.QuestionaireHeaderConfidentialityCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(questionaireHeader)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CONFIDENTIALITY_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderConfidentialityCode"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderEffectiveTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderEffectiveTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderEffectiveTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderEffectiveTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderEffectiveTime(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_EFFECTIVE_TIME,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderEffectiveTime"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderLanguageCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderLanguageCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined() and self.languageCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.languageCode.oclAsType(datatypes::CS) in "+
"not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderLanguageCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderLanguageCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderLanguageCode(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderLanguageCode"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderLanguageCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Language Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderLanguageCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderLanguageCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Language Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderLanguageCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderLanguageCodeP(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_LANGUAGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_LANGUAGE_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderLanguageCodeP"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderRealmCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Realm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRealmCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1 and self.realmCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = element.oclAsType(datatypes::CS) in "+
"not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderRealmCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Realm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRealmCode(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderRealmCode(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_REALM_CODE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderRealmCode"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderRealmCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Realm Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRealmCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.realmCode->isEmpty() or self.realmCode->exists(element | element.isNullFlavorUndefined())) implies (self.realmCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderRealmCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Realm Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRealmCodeP(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderRealmCodeP(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_REALM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_REALM_CODE_P,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderRealmCodeP"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderTitle(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTitle(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderTitle(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTitle(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderTitle(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TITLE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderTitle"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderTypeId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTypeId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.typeId.oclIsUndefined() or self.typeId.isNullFlavorUndefined()) implies (not self.typeId.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderTypeId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTypeId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderTypeId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TYPE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderTypeId"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id.oclIsUndefined() or self.id.isNullFlavorUndefined()) implies (not self.id.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderId"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->exists(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderAuthor(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthor"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->one(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderCustodian(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodian"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderRecordTarget(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTarget(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->one(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderRecordTarget(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTarget(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateQuestionaireHeaderRecordTarget(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(questionaireHeader)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderRecordTarget"),
						 new Object [] { questionaireHeader }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderTypeIdExtension(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTypeIdExtension(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not extension.oclIsUndefined() and extension='POCD_HD000040' )))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderTypeIdExtension(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTypeIdExtension(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderTypeIdExtension(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TYPE_ID_EXTENSION,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderTypeIdExtension"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderTypeIdRoot(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTypeIdRoot(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.typeId->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (not root.oclIsUndefined() and root='2.16.840.1.113883.1.3' )))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderTypeIdRoot(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Type Id Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderTypeIdRoot(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderTypeIdRoot(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_TYPE_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_TYPE_ID_ROOT,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderTypeIdRoot"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Authoring Device Manufacturer Model Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((manufacturerModelName.oclIsUndefined() or manufacturerModelName.isNullFlavorUndefined()) implies (not manufacturerModelName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Authoring Device Manufacturer Model Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_MANUFACTURER_MODEL_NAME,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceManufacturerModelName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Authoring Device Software Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedAuthoringDevice->excluding(null)->reject((softwareName.oclIsUndefined() or softwareName.isNullFlavorUndefined()) implies (not softwareName.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Authoring Device Software Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_AUTHORING_DEVICE_SOFTWARE_NAME,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorAuthoringDeviceSoftwareName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorPersonName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Person Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorPersonName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorPersonName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Person Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorPersonName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorPersonName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_PERSON_NAME,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorPersonName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((addr->isEmpty() or addr->exists(element | element.isNullFlavorUndefined())) implies (not addr->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorAddr(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ADDR,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorAddr"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject((telecom->isEmpty() or telecom->exists(element | element.isNullFlavorUndefined())) implies (not telecom->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorTelecom(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_TELECOM,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorTelecom"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Assigned Authoring Device</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedAuthoringDevice->one(assignedAuthoringDevice : cda::AuthoringDevice | not assignedAuthoringDevice.oclIsUndefined() and assignedAuthoringDevice.oclIsKindOf(cda::AuthoringDevice)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Assigned Authoring Device</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_AUTHORING_DEVICE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorAssignedAuthoringDevice"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Assigned Person</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Assigned Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorAssignedPerson(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_ASSIGNED_PERSON,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorAssignedPerson"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Represented Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(representedOrganization->one(representedOrganization : cda::Organization | not representedOrganization.oclIsUndefined() and representedOrganization.oclIsKindOf(rim::Entity)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Assigned Author Represented Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_ASSIGNED_AUTHOR_REPRESENTED_ORGANIZATION,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorAssignedAuthorRepresentedOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderAuthorTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject((time.oclIsUndefined() or time.isNullFlavorUndefined()) implies (not time.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderAuthorTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Author Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderAuthorTime(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderAuthorTime(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_AUTHOR_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_AUTHOR_TIME,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderAuthorTime"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((addr.oclIsUndefined() or addr.isNullFlavorUndefined()) implies (not addr.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ADDR,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationAddr"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (not id->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((name.oclIsUndefined() or name.isNullFlavorUndefined()) implies (not name.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_NAME,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationName"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Telecom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null).representedCustodianOrganization->excluding(null)->reject((telecom.oclIsUndefined() or telecom.isNullFlavorUndefined()) implies (not telecom.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Custodian Organization Telecom</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_CUSTODIAN_ORGANIZATION_TELECOM,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodianAssignedCustodianCustodianOrganizationTelecom"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Represented Custodian Organization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null).assignedCustodian->excluding(null)->reject(representedCustodianOrganization->one(representedCustodianOrganization : cda::CustodianOrganization | not representedCustodianOrganization.oclIsUndefined() and representedCustodianOrganization.oclIsKindOf(cda::CustodianOrganization)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian Represented Custodian Organization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN_REPRESENTED_CUSTODIAN_ORGANIZATION,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodianAssignedCustodianRepresentedCustodianOrganization"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.custodian->excluding(null)->reject(assignedCustodian->one(assignedCustodian : cda::AssignedCustodian | not assignedCustodian.oclIsUndefined() and assignedCustodian.oclIsKindOf(cda::AssignedCustodian)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderCustodianAssignedCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Custodian Assigned Custodian</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderCustodianAssignedCustodian(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderCustodianAssignedCustodian(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_CUSTODIAN_ASSIGNED_CUSTODIAN,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderCustodianAssignedCustodian"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role II Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null).id->excluding(null)->select(isNullFlavorUndefined())->reject( ( isNullFlavorUndefined() implies (isDefined('nullFlavor') )))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role II Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderRecordTargetPatientRoleIINullFlavor(
			QuestionaireHeader questionaireHeader, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_II_NULL_FLAVOR,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderRecordTargetPatientRoleIINullFlavor"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderRecordTargetPatientRoleId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTargetPatientRoleId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null).patientRole->excluding(null)->reject((id->isEmpty() or id->exists(element | element.isNullFlavorUndefined())) implies (id->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderRecordTargetPatientRoleId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTargetPatientRoleId(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderRecordTargetPatientRoleId(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE_ID,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderRecordTargetPatientRoleId"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateQuestionaireHeaderRecordTargetPatientRole(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTargetPatientRole(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.recordTarget->excluding(null)->reject(patientRole->one(patientRole : cda::PatientRole | not patientRole.oclIsUndefined() and patientRole.oclIsKindOf(cda::PatientRole)))";

	/**
	 * The cached OCL invariant for the '{@link #validateQuestionaireHeaderRecordTargetPatientRole(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Questionaire Header Record Target Patient Role</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateQuestionaireHeaderRecordTargetPatientRole(QuestionaireHeader, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	
	
	
	
	
	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY= new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param questionaireHeader The receiving '<em><b>Questionaire Header</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateQuestionaireHeaderRecordTargetPatientRole(QuestionaireHeader questionaireHeader,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.QUESTIONAIRE_HEADER);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(questionaireHeader);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.QUESTIONAIRE_HEADER__QUESTIONAIRE_HEADER_RECORD_TARGET_PATIENT_ROLE,
						 QFDDPlugin.INSTANCE.getString("QuestionaireHeaderQuestionaireHeaderRecordTargetPatientRole"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // QuestionaireHeaderOperations
