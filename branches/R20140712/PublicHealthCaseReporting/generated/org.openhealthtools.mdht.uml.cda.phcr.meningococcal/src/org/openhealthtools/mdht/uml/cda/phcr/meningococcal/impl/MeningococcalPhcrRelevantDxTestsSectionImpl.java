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
import org.openhealthtools.mdht.uml.cda.phcr.impl.PhcrRelevantDxTestsSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPackage;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.MeningococcalResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.meningococcal.util.MeningococcalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phcr Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MeningococcalPhcrRelevantDxTestsSectionImpl extends PhcrRelevantDxTestsSectionImpl implements MeningococcalPhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeningococcalPhcrRelevantDxTestsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Phcr Relevant Dx Tests Section Meningococcal Result Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(meningococcal::MeningococcalResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Phcr Relevant Dx Tests Section Meningococcal Result Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_OBSERVATION,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalPhcrRelevantDxTestsSectionMeningococcalResultObservation"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Phcr Relevant Dx Tests Section Meningococcal Result Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(meningococcal::MeningococcalResultOrganizer) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Meningococcal Phcr Relevant Dx Tests Section Meningococcal Result Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION_MENINGOCOCCAL_RESULT_ORGANIZER,
						 MeningococcalPlugin.INSTANCE.getString("MeningococcalPhcrRelevantDxTestsSectionMeningococcalResultOrganizer"),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMeningococcalResultObservations() <em>Get Meningococcal Result Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalResultObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENINGOCOCCAL_RESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(meningococcal::MeningococcalResultObservation)).oclAsType(meningococcal::MeningococcalResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getMeningococcalResultObservations() <em>Get Meningococcal Result Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalResultObservations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENINGOCOCCAL_RESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeningococcalResultObservation> getMeningococcalResultObservations() {
		if (GET_MENINGOCOCCAL_RESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION, MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(72));
			try {
				GET_MENINGOCOCCAL_RESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_MENINGOCOCCAL_RESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENINGOCOCCAL_RESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MeningococcalResultObservation> result = (Collection<MeningococcalResultObservation>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<MeningococcalResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMeningococcalResultOrganizers() <em>Get Meningococcal Result Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalResultOrganizers()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MENINGOCOCCAL_RESULT_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(meningococcal::MeningococcalResultOrganizer)).oclAsType(meningococcal::MeningococcalResultOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getMeningococcalResultOrganizers() <em>Get Meningococcal Result Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeningococcalResultOrganizers()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MENINGOCOCCAL_RESULT_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeningococcalResultOrganizer> getMeningococcalResultOrganizers() {
		if (GET_MENINGOCOCCAL_RESULT_ORGANIZERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION, MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION.getEAllOperations().get(73));
			try {
				GET_MENINGOCOCCAL_RESULT_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_MENINGOCOCCAL_RESULT_ORGANIZERS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MENINGOCOCCAL_RESULT_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MeningococcalResultOrganizer> result = (Collection<MeningococcalResultOrganizer>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<MeningococcalResultOrganizer>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.60')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MeningococcalPackage.Literals.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MeningococcalValidator.DIAGNOSTIC_SOURCE,
						 MeningococcalValidator.MENINGOCOCCAL_PHCR_RELEVANT_DX_TESTS_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", EObjectValidator.getObjectLabel(this, context) }),
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
	public MeningococcalPhcrRelevantDxTestsSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public MeningococcalPhcrRelevantDxTestsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //MeningococcalPhcrRelevantDxTestsSectionImpl
