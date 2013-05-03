/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mu2consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cognitive Status Result Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage#getCognitiveStatusResultObservation()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Mu2consolCognitiveStatusResultObservationTemplateId' templateId.root='2.16.840.1.113883.10.20.22.4.74'"
 * @generated
 */
public interface CognitiveStatusResultObservation extends org.openhealthtools.mdht.uml.cda.consol.CognitiveStatusResultObservation, ResultObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CognitiveStatusResultObservation init();
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CognitiveStatusResultObservation init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CognitiveStatusResultObservation
