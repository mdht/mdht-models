/*******************************************************************************
 * Copyright (c) 2011, 2012 Sean Muir and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sean Muir (JKM Software) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.CaregiverCharacteristics;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.PressureUlcerObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionalStatusSectionImpl extends SectionImpl implements FunctionalStatusSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionFunctionalStatusResultOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCognitiveStatusResultOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionFunctionalStatusResultObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCognitiveStatusResultObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionFunctionalStatusProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionFunctionalStatusProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCognitiveStatusProblemObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCognitiveStatusProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCaregiverCharacteristics(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionCaregiverCharacteristics(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionNonMedicinalSupplyActivity(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionPressureUlcerObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionPressureUlcerObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionNumberOfPressureUlcersObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionNumberOfPressureUlcersObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionHighestPressureUlcerStage(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionHighestPressureUlcerStage(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusResultOrganizer> getFunctionalStatusResultOrganizers() {
		return FunctionalStatusSectionOperations.getFunctionalStatusResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultOrganizer> getCognitiveStatusResultOrganizers() {
		return FunctionalStatusSectionOperations.getCognitiveStatusResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusResultObservation> getFunctionalStatusResultObservations() {
		return FunctionalStatusSectionOperations.getFunctionalStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultObservation> getCognitiveStatusResultObservations() {
		return FunctionalStatusSectionOperations.getCognitiveStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusProblemObservation> getFunctionalStatusProblemObservations() {
		return FunctionalStatusSectionOperations.getFunctionalStatusProblemObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusProblemObservation> getCognitiveStatusProblemObservations() {
		return FunctionalStatusSectionOperations.getCognitiveStatusProblemObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CaregiverCharacteristics> getCaregiverCharacteristicss() {
		return FunctionalStatusSectionOperations.getCaregiverCharacteristicss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return FunctionalStatusSectionOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity> getNonMedicinalSupplyActivities() {
		return FunctionalStatusSectionOperations.getNonMedicinalSupplyActivities(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PressureUlcerObservation> getPressureUlcerObservations() {
		return FunctionalStatusSectionOperations.getPressureUlcerObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberOfPressureUlcersObservation> getNumberOfPressureUlcersObservations() {
		return FunctionalStatusSectionOperations.getNumberOfPressureUlcersObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HighestPressureUlcerStage> getHighestPressureUlcerStages() {
		return FunctionalStatusSectionOperations.getHighestPressureUlcerStages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalStatusSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FunctionalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // FunctionalStatusSectionImpl
