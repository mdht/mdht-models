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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.consol.BoundaryObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ReferencedFramesObservation;
import org.openhealthtools.mdht.uml.cda.consol.operations.ReferencedFramesObservationOperations;
import org.openhealthtools.mdht.uml.cda.impl.ObservationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenced Frames Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReferencedFramesObservationImpl extends ObservationImpl implements ReferencedFramesObservation {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected ReferencedFramesObservationImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.REFERENCED_FRAMES_OBSERVATION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateReferencedFramesObservationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferencedFramesObservationOperations.validateReferencedFramesObservationTemplateId(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateReferencedFramesObservationClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencedFramesObservationOperations.validateReferencedFramesObservationClassCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateReferencedFramesObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencedFramesObservationOperations.validateReferencedFramesObservationCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateReferencedFramesObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ReferencedFramesObservationOperations.validateReferencedFramesObservationMoodCode(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateReferencedFramesObservationBoundaryObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return ReferencedFramesObservationOperations.validateReferencedFramesObservationBoundaryObservation(
			this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public BoundaryObservation getBoundaryObservation() {
		return ReferencedFramesObservationOperations.getBoundaryObservation(this);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public ReferencedFramesObservation init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferencedFramesObservation init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // ReferencedFramesObservationImpl
