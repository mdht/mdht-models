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
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VisibleImplantedMedicalDevicesSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visible Implanted Medical Devices Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VisibleImplantedMedicalDevicesSectionImpl extends SectionImpl
		implements VisibleImplantedMedicalDevicesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibleImplantedMedicalDevicesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibleImplantedMedicalDevicesSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibleImplantedMedicalDevicesSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibleImplantedMedicalDevicesSectionProblemEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry getProblemEntry() {
		return VisibleImplantedMedicalDevicesSectionOperations.getProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleImplantedMedicalDevicesSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleImplantedMedicalDevicesSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // VisibleImplantedMedicalDevicesSectionImpl
