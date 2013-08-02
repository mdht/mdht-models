/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultObservation;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.mu2consol.operations.ResultOrganizerOperations;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Result Organizer</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ResultOrganizerImpl extends
		org.openhealthtools.mdht.uml.cda.consol.impl.ResultOrganizerImpl
		implements ResultOrganizer {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultOrganizerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mu2consolPackage.Literals.RESULT_ORGANIZER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMU2CONSOLResultOrganizerResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateMU2CONSOLResultOrganizerResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultObservation> getMu2consolResultObservations() {
		return ResultOrganizerOperations.getMu2consolResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultOrganizerTemplateId(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ResultOrganizerOperations.validateResultOrganizerTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResultOrganizer init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	public ResultOrganizer init(
			Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // ResultOrganizerImpl
