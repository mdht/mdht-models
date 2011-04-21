/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.ANY;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAge Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A common scenario is that a patient will know the age of a relative when they had a certain condition or when they died, but will not know the actual year (e.g. "grandpa died of a heart attack at the age of 50"). Often times, neither precise dates nor ages are known (e.g. "cousin died of congenital heart disease as an infant"). In all cases, dates and times and ages can be expressed in narrative.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getIAgeObservation()
 * @generated
 */
public interface IAgeObservation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Observation toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * cda::Observation::value.
	 * Valued using appropriate datatype.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	ANY getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <b>SHALL</b> contain exactly one [1..1] <tt><b>value</b></tt> (CONF-231).
	 * <!-- end-model-doc -->
	 * @generated
	 */
	void setValue(ANY value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAgeObservation init();
} // IAgeObservation
