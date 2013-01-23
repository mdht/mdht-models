/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;
import org.openhealthtools.mdht.uml.cda.ihe.operations.CoverageEntryOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Insurance Provider</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPaymentProviders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payment Providers</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPayerEntryID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Payer Entry ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderHealthInsuranceType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Insurance Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderInsuranceInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceID(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source ID</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderInsuranceInfoSourceAddr(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Insurance Info Source Addr</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStartTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Start Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderHealthPlanCoverageStopTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Health Plan Coverage Stop Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPatientInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderMemberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderMemberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Member Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderRelationshipToSubscriberCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Relationship To Subscriber Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderPatientName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Patient Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberInformation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Information</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberIdRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Id Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderSubscriberAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Subscriber Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyType(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderFinancialResponsibilityPartyAddress(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Financial Responsibility Party Address</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider#validateInsuranceProviderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Insurance Provider Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsuranceProviderOperations extends CoverageEntryOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceProviderOperations() {
		super();
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYMENT_PROVIDERS,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderPaymentProviders"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PAYER_ENTRY_ID,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderPayerEntryID"), new Object[] { insuranceProvider }));
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_INSURANCE_TYPE,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderHealthInsuranceType"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFORMATION,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderInsuranceInformation"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ID,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderInsuranceInfoSourceID"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_INSURANCE_INFO_SOURCE_ADDR,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderInsuranceInfoSourceAddr"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_START_TIME,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderHealthPlanCoverageStartTime"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_HEALTH_PLAN_COVERAGE_STOP_TIME,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderHealthPlanCoverageStopTime"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PATIENT_INFORMATION,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderPatientInformation"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_MEMBER_ID,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderMemberId"), new Object[] { insuranceProvider }));
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_MEMBER_ID_ROOT,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderMemberIdRoot"), new Object[] { insuranceProvider }));
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderRelationshipToSubscriber"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_RELATIONSHIP_TO_SUBSCRIBER_CODE_SYSTEM,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderRelationshipToSubscriberCodeSystem"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_PATIENT_NAME,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderPatientName"), new Object[] { insuranceProvider }));
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_INFORMATION,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderSubscriberInformation"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ID,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderSubscriberId"), new Object[] { insuranceProvider }));
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ID_ROOT,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderSubscriberIdRoot"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_SUBSCRIBER_ADDRESS,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderSubscriberAddress"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderFinancialResponsibilityPartyType"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_TYPE_CODE,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderFinancialResponsibilityPartyTypeCode"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.WARNING, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_FINANCIAL_RESPONSIBILITY_PARTY_ADDRESS,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderFinancialResponsibilityPartyAddress"),
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderTemplateId"), new Object[] { insuranceProvider }));
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
			+ "let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "
			+ "value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')";

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
	 * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
	 * value.code = '48768-6' and value.codeSystem = '2.16.840.1.113883.6.1')
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
			helper.setContext(HITSPPackage.Literals.INSURANCE_PROVIDER);
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
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.INSURANCE_PROVIDER__INSURANCE_PROVIDER_CODE,
					HITSPPlugin.INSTANCE.getString("InsuranceProviderCode"), new Object[] { insuranceProvider }));
			}

			return false;
		}
		return true;
	}

} // InsuranceProviderOperations
