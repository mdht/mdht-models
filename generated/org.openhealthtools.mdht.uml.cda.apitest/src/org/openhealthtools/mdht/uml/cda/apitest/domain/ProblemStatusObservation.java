/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.openhealthtools.mdht.uml.hl7.datatypes.CE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Problem Status Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Any problem or allergy observation may reference a problem status observation. The clinical status observation records information about the current status of the problem or allergy, for example, whether it is active, in remission, resolved, et cetera.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getProblemStatusObservation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ProblemStatusObservation extends StatusObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHALL</b> contain exactly one [1..1] <tt><b>value</b></tt>, which <b>SHALL</b> be selected from ValueSet<tt> ProblemStatusValue</tt><b> STATIC</b></p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	ProblemStatusObservation setValue(CE value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemStatusObservation init();
} // ProblemStatusObservation
