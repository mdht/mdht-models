/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.consol.PayerEntry;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Insurance Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInformationSource(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Information Source</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSequenceNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Sequence Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPaymentProviders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payment Providers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPayerEntryID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderHealthInsuranceType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Insurance Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInsuranceInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Start Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStopTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Stop Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPatientInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderMemberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderMemberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriberCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderSubscriberAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#validateInsuranceProviderPayerEntry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.InsuranceProvider#getPayerEntries() <em>Get Payer Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsuranceProviderOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceProviderOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderInformationSource(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Information Source</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInformationSource(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.informant->isEmpty() "
			+ "  or not self.getSection().informant->isEmpty()"
			+ "  or not self.getClinicalDocument().informant->isEmpty()"
			+ "  or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)"
			+ "  or (self.entryRelationship->exists(rel : cda::EntryRelationship | "
			+ "   rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR"
			+ "   and rel.observation.code.code = '48766-0'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderInformationSource(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Information Source</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInformationSource(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.informant->isEmpty() 
	 *   or not self.getSection().informant->isEmpty()
	 *   or not self.getClinicalDocument().informant->isEmpty()
	 *   or self.reference->exists(ref : cda::Reference | ref.typeCode = vocab::x_ActRelationshipExternalReference::XCRPT)
	 *   or (self.entryRelationship->exists(rel : cda::EntryRelationship | 
	 *    rel.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR
	 *    and rel.observation.code.code = '48766-0'))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderInformationSource(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_INFORMATION_SOURCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INFORMATION_SOURCE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderInformationSource"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderSequenceNumber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Sequence Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSequenceNumber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(rel : cda::EntryRelationship | not rel.sequenceNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderSequenceNumber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Sequence Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSequenceNumber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(rel : cda::EntryRelationship | not rel.sequenceNumber.oclIsUndefined())
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderSequenceNumber(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_SEQUENCE_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SEQUENCE_NUMBER,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderSequenceNumber"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderPaymentProviders(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payment Providers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPaymentProviders(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderPaymentProviders(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payment Providers</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPaymentProviders(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->exists(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderPaymentProviders(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_PAYMENT_PROVIDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYMENT_PROVIDERS,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderPaymentProviders"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderPayerEntryID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPayerEntryID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | not a.id.root->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderPayerEntryID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPayerEntryID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | not a.id.root->isEmpty())
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderPayerEntryID(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYER_ENTRY_ID,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderPayerEntryID"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderHealthInsuranceType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Insurance Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderHealthInsuranceType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = '2.16.840.1.113883.6.255.1336' and (a.code.code='12' or a.code.code='13' or a.code.code='14' or a.code.code='15' or a.code.code='16' or a.code.code='41' or a.code.code='42' or a.code.code='43' or a.code.code='47' or a.code.code='AP' or a.code.code='C1' or a.code.code='CO' or a.code.code='CP' or a.code.code='D' or a.code.code='DB' or a.code.code='EP' or a.code.code='FF' or a.code.code='GP' or a.code.code='HM' or a.code.code='HN' or a.code.code='HS' or a.code.code='IN' or a.code.code='IP' or a.code.code='LC' or a.code.code='LD' or a.code.code='LI' or a.code.code='LT' or a.code.code='MA' or a.code.code='MB' or a.code.code='MC' or a.code.code='MH' or a.code.code='MI' or a.code.code='MP' or a.code.code='OT' or a.code.code='PE' or a.code.code='PL' or a.code.code='PP' or a.code.code='PR' or a.code.code='PS' or a.code.code='QM' or a.code.code='RP' or a.code.code='SP' or a.code.code='TF' or a.code.code='WC' or a.code.code='WU'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderHealthInsuranceType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Insurance Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderHealthInsuranceType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.code.codeSystem = '2.16.840.1.113883.6.255.1336' and (a.code.code='12' or a.code.code='13' or a.code.code='14' or a.code.code='15' or a.code.code='16' or a.code.code='41' or a.code.code='42' or a.code.code='43' or a.code.code='47' or a.code.code='AP' or a.code.code='C1' or a.code.code='CO' or a.code.code='CP' or a.code.code='D' or a.code.code='DB' or a.code.code='EP' or a.code.code='FF' or a.code.code='GP' or a.code.code='HM' or a.code.code='HN' or a.code.code='HS' or a.code.code='IN' or a.code.code='IP' or a.code.code='LC' or a.code.code='LD' or a.code.code='LI' or a.code.code='LT' or a.code.code='MA' or a.code.code='MB' or a.code.code='MC' or a.code.code='MH' or a.code.code='MI' or a.code.code='MP' or a.code.code='OT' or a.code.code='PE' or a.code.code='PL' or a.code.code='PP' or a.code.code='PR' or a.code.code='PS' or a.code.code='QM' or a.code.code='RP' or a.code.code='SP' or a.code.code='TF' or a.code.code='WC' or a.code.code='WU'))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderHealthInsuranceType(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderHealthInsuranceType"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderInsuranceInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInsuranceInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderInsuranceInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInsuranceInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderInsuranceInformation(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFORMATION,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderInsuranceInformation"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderInsuranceInfoSourceID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source ID</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInsuranceInfoSourceID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.id->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderInsuranceInfoSourceID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source ID</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInsuranceInfoSourceID(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.id->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderInsuranceInfoSourceID(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderInsuranceInfoSourceID"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderInsuranceInfoSourceAddr(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source Addr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInsuranceInfoSourceAddr(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.addr->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderInsuranceInfoSourceAddr(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source Addr</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderInsuranceInfoSourceAddr(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists (perm : cda::Performer2 | perm.typeCode = vocab::ParticipationPhysicalPerformer::PRF and perm.assignedEntity.addr->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderInsuranceInfoSourceAddr(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderInsuranceInfoSourceAddr"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderHealthPlanCoverageStartTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Start Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderHealthPlanCoverageStartTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.low->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderHealthPlanCoverageStartTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Start Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderHealthPlanCoverageStartTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.low->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderHealthPlanCoverageStartTime(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderHealthPlanCoverageStartTime"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderHealthPlanCoverageStopTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Stop Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderHealthPlanCoverageStopTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.high->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderHealthPlanCoverageStopTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Stop Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderHealthPlanCoverageStopTime(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.time.high->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderHealthPlanCoverageStopTime(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderHealthPlanCoverageStopTime"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderPatientInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPatientInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderPatientInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPatientInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderPatientInformation(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_PATIENT_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PATIENT_INFORMATION,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderPatientInformation"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderMemberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderMemberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderMemberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderMemberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderMemberId(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_MEMBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_MEMBER_ID,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderMemberId"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderMemberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderMemberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id.root->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderMemberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderMemberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.id.root->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderMemberIdRoot(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_MEMBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_MEMBER_ID_ROOT,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderMemberIdRoot"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderRelationshipToSubscriber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderRelationshipToSubscriber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderRelationshipToSubscriber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderRelationshipToSubscriber(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderRelationshipToSubscriber(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderRelationshipToSubscriber"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderRelationshipToSubscriberCodeSystem(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber Code System</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderRelationshipToSubscriberCodeSystem(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = '2.16.840.1.113883.5.111' and (par.participantRole.code.code = 'FAMDEP' or par.participantRole.code.code='HANDIC' or par.participantRole.code.code ='INJ' or par.participantRole.code.code='SELF' or par.participantRole.code.code='SPON' or par.participantRole.code.code ='STUD' or par.participantRole.code.code='FSTUD' or par.participantRole.code.code='PSTUD')))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderRelationshipToSubscriberCodeSystem(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber Code System</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderRelationshipToSubscriberCodeSystem(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.code.codeSystem = '2.16.840.1.113883.5.111' and (par.participantRole.code.code = 'FAMDEP' or par.participantRole.code.code='HANDIC' or par.participantRole.code.code ='INJ' or par.participantRole.code.code='SELF' or par.participantRole.code.code='SPON' or par.participantRole.code.code ='STUD' or par.participantRole.code.code='FSTUD' or par.participantRole.code.code='PSTUD')))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderRelationshipToSubscriberCodeSystem(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderRelationshipToSubscriberCodeSystem"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderPatientName(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPatientName(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.playingEntity.name->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderPatientName(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPatientName(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists (par : cda::Participant2 | par.typeCode = vocab::ParticipationType::COV and par.participantRole.classCode = vocab::RoleClassRoot::PAT and par.participantRole.playingEntity.name->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderPatientName(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_PATIENT_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PATIENT_NAME,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderPatientName"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderSubscriberInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderSubscriberInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Information</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberInformation(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderSubscriberInformation(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderSubscriberInformation"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderSubscriberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderSubscriberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderSubscriberId(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ID,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderSubscriberId"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderSubscriberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id.root->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderSubscriberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberIdRoot(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.id.root->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderSubscriberIdRoot(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderSubscriberIdRoot"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderSubscriberAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.addr->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderSubscriberAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderSubscriberAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.participant->exists(par : cda::Participant2 | par.typeCode = vocab::ParticipationType::HLD and par.participantRole.addr->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderSubscriberAddress(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderSubscriberAddress"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderFinancialResponsibilityPartyType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderFinancialResponsibilityPartyType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.typeCode = vocab::ParticipationPhysicalPerformer::PRF and per.assignedEntity.code->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderFinancialResponsibilityPartyType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderFinancialResponsibilityPartyType(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.typeCode = vocab::ParticipationPhysicalPerformer::PRF and per.assignedEntity.code->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderFinancialResponsibilityPartyType(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderFinancialResponsibilityPartyType"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderFinancialResponsibilityPartyTypeCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderFinancialResponsibilityPartyTypeCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = '2.16.840.1.113883.5.110'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderFinancialResponsibilityPartyTypeCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderFinancialResponsibilityPartyTypeCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.code.codeSystem = '2.16.840.1.113883.5.110'))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderFinancialResponsibilityPartyTypeCode(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderFinancialResponsibilityPartyTypeCode"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderFinancialResponsibilityPartyAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderFinancialResponsibilityPartyAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.addr->size() > 0))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderFinancialResponsibilityPartyAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Address</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderFinancialResponsibilityPartyAddress(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | act.oclIsKindOf(ihe::PayerEntry))->forAll(a : cda::Act | a.performer->exists(per : cda::Performer2 | per.assignedEntity.addr->size() > 0))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderFinancialResponsibilityPartyAddress(
			InsuranceProvider insuranceProvider, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderFinancialResponsibilityPartyAddress"),
					new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderTemplateId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderTemplateId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderTemplateId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderTemplateId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.5')
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderTemplateId(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderTemplateId"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderClassCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderClassCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderClassCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderClassCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.classCode=vocab::x_ActClassDocumentEntryAct::ACT
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderClassCode(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_CLASS_CODE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderClassCode"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderMoodCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderMoodCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::DEF";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderMoodCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderMoodCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.moodCode=vocab::x_DocumentActMood::DEF
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderMoodCode(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_MOOD_CODE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderMoodCode"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderId(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderId(InsuranceProvider insuranceProvider, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_ID,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderId"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in ("
			+ "value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in (
	 * value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderCode(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_CODE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderCode"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderStatusCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderStatusCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "
			+ "let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in ("
			+ "value.code = 'completed'))";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderStatusCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderStatusCode(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and 
	 * let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in (
	 * value.code = 'completed'))
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderStatusCode(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_STATUS_CODE,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderStatusCode"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInsuranceProviderPayerEntry(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPayerEntry(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PayerEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInsuranceProviderPayerEntry(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInsuranceProviderPayerEntry(InsuranceProvider, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::PayerEntry) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateInsuranceProviderPayerEntry(InsuranceProvider insuranceProvider,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.INSURANCE_PROVIDER);
			try {
				VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INSURANCE_PROVIDER_PAYER_ENTRY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			insuranceProvider)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYER_ENTRY,
					ConsolPlugin.INSTANCE.getString("InsuranceProviderPayerEntry"), new Object[] { insuranceProvider }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPayerEntries(InsuranceProvider) <em>Get Payer Entries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntries(InsuranceProvider)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PAYER_ENTRIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PayerEntry)).oclAsType(consol::PayerEntry)";

	/**
	 * The cached OCL query for the '{@link #getPayerEntries(InsuranceProvider) <em>Get Payer Entries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerEntries(InsuranceProvider)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PAYER_ENTRIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PayerEntry)).oclAsType(consol::PayerEntry)
	 * @param insuranceProvider The receiving '<em><b>Insurance Provider</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<PayerEntry> getPayerEntries(InsuranceProvider insuranceProvider) {
		if (GET_PAYER_ENTRIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.INSURANCE_PROVIDER,
				ConsolPackage.Literals.INSURANCE_PROVIDER.getEAllOperations().get(79));
			try {
				GET_PAYER_ENTRIES__EOCL_QRY = helper.createQuery(GET_PAYER_ENTRIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PAYER_ENTRIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PayerEntry> result = (Collection<PayerEntry>) query.evaluate(insuranceProvider);
		return new BasicEList.UnmodifiableEList<PayerEntry>(result.size(), result.toArray());
	}

} // InsuranceProviderOperations
