/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.openhealthtools.mdht.uml.cda.Birthplace;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Birthplace</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getPatient_Birthplace()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='BirthplacePlace'"
 * @generated
 */
public interface Patient_Birthplace extends Birthplace {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.place->one(place : cda::Place | not place.oclIsUndefined() and place.oclIsKindOf(cda::Place))'"
	 * @generated
	 */
	boolean validateBirthplacePlace(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient_Birthplace init();
} // Patient_Birthplace
