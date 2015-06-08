/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.CognitiveStatusResultOrganizerOperations;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Cognitive Status Result Organizer</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 * 
 * @generated
 */
public class CognitiveStatusResultOrganizerImpl
		extends
		org.openhealthtools.mdht.uml.cda.consol.impl.CognitiveStatusResultOrganizerImpl
		implements CognitiveStatusResultOrganizer {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected CognitiveStatusResultOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.COGNITIVE_STATUS_RESULT_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ResultObservation> getMu2consolResultObservations() {
		return ResultOrganizerOperations.getMu2consolResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return CognitiveStatusResultOrganizerOperations
				.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerResultObservation(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations
				.validateResultOrganizerResultObservation(this, diagnostics,
						context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<CognitiveStatusResultObservation> getMu2consolCognitiveStatusResultObservations() {
		return CognitiveStatusResultOrganizerOperations
				.getMu2consolCognitiveStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public CognitiveStatusResultOrganizer init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public CognitiveStatusResultOrganizer init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // CognitiveStatusResultOrganizerImpl
