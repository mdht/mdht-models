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

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HandoffCommunicationParticipants;
import org.openhealthtools.mdht.uml.cda.consol.InterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.InterventionsSection2;

import org.openhealthtools.mdht.uml.cda.consol.PlannedInterventionAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.InterventionsSection2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interventions Section2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InterventionsSection2Impl extends InterventionsSectionImpl implements InterventionsSection2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterventionsSection2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.INTERVENTIONS_SECTION2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSection2InterventionAct(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2InterventionAct(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2HandoffCommunication(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2HandoffCommunication(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterventionsSection2PlannedInterventionAct(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSection2PlannedInterventionAct(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InterventionAct> getInterventionActs() {
		return InterventionsSection2Operations.getInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HandoffCommunicationParticipants> getHandoffCommunications() {
		return InterventionsSection2Operations.getHandoffCommunications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PlannedInterventionAct> getPlannedInterventionActs() {
		return InterventionsSection2Operations.getPlannedInterventionActs(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateInterventionsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InterventionsSection2Operations.validateInterventionsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionsSection2 init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InterventionsSection2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // InterventionsSection2Impl
