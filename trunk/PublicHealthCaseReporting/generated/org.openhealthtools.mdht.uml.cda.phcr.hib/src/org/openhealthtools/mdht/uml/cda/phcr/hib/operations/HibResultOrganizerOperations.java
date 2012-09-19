/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.hib.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer;

import org.openhealthtools.mdht.uml.cda.phcr.hib.util.HibValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Organizer</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer#validateHibResultOrganizerHibResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Result Organizer Hib Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer#getHibResultObservation() <em>Get Hib Result Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibResultOrganizer#validateResultOrganizerTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HibResultOrganizerOperations extends ResultOrganizerOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibResultOrganizerOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHibResultOrganizerHibResultObservation(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Result Organizer Hib Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibResultOrganizerHibResultObservation(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(hib::HibResultObservation))";

	/**
	 * The cached OCL invariant for the '{@link #validateHibResultOrganizerHibResultObservation(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Result Organizer Hib Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibResultOrganizerHibResultObservation(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.component->one(component : cda::Component4 | not component.observation.oclIsUndefined() and component.observation.oclIsKindOf(hib::HibResultObservation))
	 * @param hibResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHibResultOrganizerHibResultObservation(HibResultOrganizer hibResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_RESULT_ORGANIZER);
			try {
				VALIDATE_HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_RESULT_ORGANIZER__HIB_RESULT_ORGANIZER_HIB_RESULT_OBSERVATION,
						 HibPlugin.INSTANCE.getString("HibResultOrganizerHibResultObservation"),
						 new Object [] { hibResultOrganizer }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHibResultObservation(HibResultOrganizer) <em>Get Hib Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibResultObservation(HibResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_RESULT_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibResultObservation))->asSequence()->first().oclAsType(hib::HibResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getHibResultObservation(HibResultOrganizer) <em>Get Hib Result Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibResultObservation(HibResultOrganizer)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_RESULT_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibResultObservation))->asSequence()->first().oclAsType(hib::HibResultObservation)
	 * @param hibResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HibResultObservation getHibResultObservation(HibResultOrganizer hibResultOrganizer) {
		if (GET_HIB_RESULT_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_RESULT_ORGANIZER, HibPackage.Literals.HIB_RESULT_ORGANIZER.getEAllOperations().get(72));
			try {
				GET_HIB_RESULT_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HIB_RESULT_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_RESULT_OBSERVATION__EOCL_QRY);
		return (HibResultObservation) query.evaluate(hibResultOrganizer);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultOrganizerTemplateId(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.136')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultOrganizerTemplateId(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Organizer Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultOrganizerTemplateId(HibResultOrganizer, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.136')
	 * @param hibResultOrganizer The receiving '<em><b>Result Organizer</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultOrganizerTemplateId(HibResultOrganizer hibResultOrganizer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_RESULT_ORGANIZER);
			try {
				VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULT_ORGANIZER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibResultOrganizer)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_RESULT_ORGANIZER__RESULT_ORGANIZER_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultOrganizerTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hibResultOrganizer, context) }),
						 new Object [] { hibResultOrganizer }));
			}
			return false;
		}
		return true;
	}

} // HibResultOrganizerOperations