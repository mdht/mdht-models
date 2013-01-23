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
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.InsuranceProvider;
import org.openhealthtools.mdht.uml.cda.hitsp.PayersSection;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Payers Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PayersSection#validateHITSPPayersSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Payers Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PayersSection#validateHITSPPayersSectionInsuranceProvider(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Payers Section Insurance Provider</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.PayersSection#getInsuranceProviders() <em>Get Insurance Providers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PayersSectionOperations extends org.openhealthtools.mdht.uml.cda.ihe.operations.PayersSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PayersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Payers Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.101')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Payers Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPayersSectionTemplateId(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.101')
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPPayersSectionTemplateId(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PAYERS_SECTION);
			try {
				VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PAYERS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			payersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.PAYERS_SECTION__HITSP_PAYERS_SECTION_TEMPLATE_ID,
					HITSPPlugin.INSTANCE.getString("HITSPPayersSectionTemplateId"), new Object[] { payersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPPayersSectionInsuranceProvider(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Payers Section Insurance Provider</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPayersSectionInsuranceProvider(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::InsuranceProvider))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPPayersSectionInsuranceProvider(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Payers Section Insurance Provider</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPPayersSectionInsuranceProvider(PayersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::InsuranceProvider))
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHITSPPayersSectionInsuranceProvider(PayersSection payersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HITSPPackage.Literals.PAYERS_SECTION);
			try {
				VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HITSP_PAYERS_SECTION_INSURANCE_PROVIDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			payersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
					HITSPValidator.PAYERS_SECTION__HITSP_PAYERS_SECTION_INSURANCE_PROVIDER,
					HITSPPlugin.INSTANCE.getString("HITSPPayersSectionInsuranceProvider"),
					new Object[] { payersSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInsuranceProviders(PayersSection) <em>Get Insurance Providers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceProviders(PayersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INSURANCE_PROVIDERS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::InsuranceProvider)).oclAsType(hitsp::InsuranceProvider)";

	/**
	 * The cached OCL query for the '{@link #getInsuranceProviders(PayersSection) <em>Get Insurance Providers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceProviders(PayersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INSURANCE_PROVIDERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::InsuranceProvider)).oclAsType(hitsp::InsuranceProvider)
	 * @param payersSection The receiving '<em><b>Payers Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<InsuranceProvider> getInsuranceProviders(PayersSection payersSection) {
		if (GET_INSURANCE_PROVIDERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.PAYERS_SECTION, HITSPPackage.Literals.PAYERS_SECTION.getEAllOperations().get(66));
			try {
				GET_INSURANCE_PROVIDERS__EOCL_QRY = helper.createQuery(GET_INSURANCE_PROVIDERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INSURANCE_PROVIDERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InsuranceProvider> result = (Collection<InsuranceProvider>) query.evaluate(payersSection);
		return new BasicEList.UnmodifiableEList<InsuranceProvider>(result.size(), result.toArray());
	}

} // PayersSectionOperations
