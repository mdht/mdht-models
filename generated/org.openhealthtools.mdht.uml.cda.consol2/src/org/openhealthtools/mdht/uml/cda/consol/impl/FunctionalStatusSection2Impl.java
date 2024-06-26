/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusSection2;
import org.openhealthtools.mdht.uml.cda.consol.HighestPressureUlcerStage;
import org.openhealthtools.mdht.uml.cda.consol.NonMedicinalSupplyActivity2;
import org.openhealthtools.mdht.uml.cda.consol.NumberOfPressureUlcersObservation;
import org.openhealthtools.mdht.uml.cda.consol.SelfCareActivities;
import org.openhealthtools.mdht.uml.cda.consol.SensoryStatus;
import org.openhealthtools.mdht.uml.cda.consol.operations.FunctionalStatusSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FunctionalStatusSection2Impl extends FunctionalStatusSectionImpl implements FunctionalStatusSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalStatusSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.FUNCTIONAL_STATUS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection2TemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSection2TemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection2SelfCareActivities(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSection2SelfCareActivities(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFunctionalStatusSection2SensoryAndSpeechStatus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSection2SensoryAndSpeechStatus(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusOrganizer2> getConsolFunctionalStatusOrganizer2s() {
		return FunctionalStatusSection2Operations.getConsolFunctionalStatusOrganizer2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusObservation2> getConsolFunctionalStatusObservation2s() {
		return FunctionalStatusSection2Operations.getConsolFunctionalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultOrganizer> getConsolCognitiveStatusResultOrganizers() {
		return FunctionalStatusSection2Operations.getConsolCognitiveStatusResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultObservation> getConsolCognitiveStatusResultObservations() {
		return FunctionalStatusSection2Operations.getConsolCognitiveStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonMedicinalSupplyActivity2> getConsolNonMedicinalSupplyActivity2s() {
		return FunctionalStatusSection2Operations.getConsolNonMedicinalSupplyActivity2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NumberOfPressureUlcersObservation> getConsolNumberOfPressureUlcersObservations() {
		return FunctionalStatusSection2Operations.getConsolNumberOfPressureUlcersObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HighestPressureUlcerStage> getConsolHighestPressureUlcerStages() {
		return FunctionalStatusSection2Operations.getConsolHighestPressureUlcerStages(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelfCareActivities> getSelfCareActivitiess() {
		return FunctionalStatusSection2Operations.getSelfCareActivitiess(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SensoryStatus> getSensoryAndSpeechStatuss() {
		return FunctionalStatusSection2Operations.getSensoryAndSpeechStatuss(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionFunctionalStatusResultOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionFunctionalStatusResultOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionFunctionalStatusResultObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionFunctionalStatusResultObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionCognitiveStatusResultOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCognitiveStatusResultOrganizer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionCognitiveStatusResultObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionCognitiveStatusResultObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionNonMedicinalSupplyActivity(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionNonMedicinalSupplyActivity(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionNumberOfPressureUlcersObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionNumberOfPressureUlcersObservation(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionHighestPressureUlcerStage(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return FunctionalStatusSection2Operations.validateFunctionalStatusSectionHighestPressureUlcerStage(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // FunctionalStatusSection2Impl
