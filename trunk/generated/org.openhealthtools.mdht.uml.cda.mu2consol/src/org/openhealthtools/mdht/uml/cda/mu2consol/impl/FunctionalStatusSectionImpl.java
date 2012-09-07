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

import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultOrganizer;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusProblemObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultObservation;
import org.openhealthtools.mdht.uml.cda.consol.FunctionalStatusResultOrganizer;

import org.openhealthtools.mdht.uml.cda.mu2consol.FunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;

import org.openhealthtools.mdht.uml.cda.mu2consol.operations.FunctionalStatusSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Status Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FunctionalStatusSectionImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.FunctionalStatusSectionImpl implements FunctionalStatusSection {
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
		return Mu2consolPackage.Literals.FUNCTIONAL_STATUS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionCognitiveStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionCognitiveStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionFunctionalStatus(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionFunctionalStatus(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionCognitiveStatusProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionCognitiveStatusResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionCognitiveStatusResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionCognitiveStatusResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionFunctionalStatusProblemObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionFunctionalStatusResultObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionFunctionalStatusResultObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateMu2consolFunctionalStatusSectionFunctionalStatusResultOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusProblemObservation> getmu2consolCognitiveStatusProblemObservations() {
		return FunctionalStatusSectionOperations.getmu2consolCognitiveStatusProblemObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultObservation> getmu2consolCognitiveStatusResultObservations() {
		return FunctionalStatusSectionOperations.getmu2consolCognitiveStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CognitiveStatusResultOrganizer> getmu2consolCognitiveStatusResultOrganizers() {
		return FunctionalStatusSectionOperations.getmu2consolCognitiveStatusResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusProblemObservation> getmu2consolFunctionalStatusProblemObservations() {
		return FunctionalStatusSectionOperations.getmu2consolFunctionalStatusProblemObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusResultObservation> getmu2consolFunctionalStatusResultObservations() {
		return FunctionalStatusSectionOperations.getmu2consolFunctionalStatusResultObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalStatusResultOrganizer> getmu2consolFunctionalStatusResultOrganizers() {
		return FunctionalStatusSectionOperations.getmu2consolFunctionalStatusResultOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateFunctionalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return FunctionalStatusSectionOperations.validateFunctionalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalStatusSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public FunctionalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //FunctionalStatusSectionImpl
