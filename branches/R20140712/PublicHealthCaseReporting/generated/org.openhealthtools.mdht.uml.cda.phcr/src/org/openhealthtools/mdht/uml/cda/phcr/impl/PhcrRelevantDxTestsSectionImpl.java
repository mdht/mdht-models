/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.ccd.impl.ResultsSectionImpl;
import org.openhealthtools.mdht.uml.cda.phcr.ImagingObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrPackage;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.ResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relevant Dx Tests Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PhcrRelevantDxTestsSectionImpl extends ResultsSectionImpl implements PhcrRelevantDxTestsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhcrRelevantDxTestsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PhcrPackage.Literals.PHCR_RELEVANT_DX_TESTS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validatePhcrRelevantDxTestsSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionCodeP(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantDxTestsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantDxTestsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantDxTestsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantDxTestsSectionResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantDxTestsSectionResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhcrRelevantDxTestsSectionImagingObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validatePhcrRelevantDxTestsSectionImagingObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultOrganizer> getPHCRResultOrganizers() {
		return PhcrRelevantDxTestsSectionOperations.getPHCRResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultObservation> getResultObservations() {
		return PhcrRelevantDxTestsSectionOperations.getResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImagingObservation> getImagingObservations() {
		return PhcrRelevantDxTestsSectionOperations.getImagingObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateResultsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhcrRelevantDxTestsSectionOperations.validateResultsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PhcrRelevantDxTestsSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public PhcrRelevantDxTestsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
	
} //PhcrRelevantDxTestsSectionImpl
