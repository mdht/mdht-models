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
package org.openhealthtools.mdht.uml.cda.phcr.meningococcal.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalSignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.util.MeningococcalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeningococcalCaseObservationImpl extends CaseObservationImpl implements MeningococcalCaseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeningococcalCaseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_OBSERVATION;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Observation Meningococcal Signs And Symptoms Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(meningococcal::MeningococcalSignsAndSymptomsObservation) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::MFST)";

	/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Case Observation Meningococcal Signs And Symptoms Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_OBSERVATION);
			try {
				VALIDATE_MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_CASE_OBSERVATION__MENINGOCOCCAL_CASE_OBSERVATION_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATION,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalCaseObservationMeningococcalSignsAndSymptomsObservation"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMeningococcalSignsAndSymptomsObservations() <em>Get Meningococcal Signs And Symptoms Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalSignsAndSymptomsObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(meningococcal::MeningococcalSignsAndSymptomsObservation)).oclAsType(meningococcal::MeningococcalSignsAndSymptomsObservation)";

	/**
	 * The cached OCL query for the '{@link #getMeningococcalSignsAndSymptomsObservations() <em>Get Meningococcal Signs And Symptoms Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalSignsAndSymptomsObservations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeningococcalSignsAndSymptomsObservation> getMeningococcalSignsAndSymptomsObservations() {
		if (GET_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_OBSERVATION, MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_OBSERVATION.getEAllOperations().get(78));
			try {
				GET_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENINGOCOCCAL_SIGNS_AND_SYMPTOMS_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MeningococcalSignsAndSymptomsObservation> result = (Collection<MeningococcalSignsAndSymptomsObservation>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<MeningococcalSignsAndSymptomsObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.138')";

	/**
	 * The cached OCL invariant for the '{@link #validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Problem Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateProblemObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_CASE_OBSERVATION);
			try {
				VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PROBLEM_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_CASE_OBSERVATION__PROBLEM_OBSERVATION_TEMPLATE_ID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProblemObservationTemplateId", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeningococcalCaseObservation init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MeningococcalCaseObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MeningococcalCaseObservationImpl
