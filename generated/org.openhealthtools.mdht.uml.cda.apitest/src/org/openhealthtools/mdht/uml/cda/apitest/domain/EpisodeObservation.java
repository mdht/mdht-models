/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.apitest.domain;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Episode Observation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Episode observations are used to distinguish among multiple occurrences of a problem or social history item. An episode observation is used to indicate that a problem act represents a new episode, distinct from other episodes of a similar concern.
 * <p>Refer to full implementation guide <a href="http://www.cdatools.org/infocenter/index.jsp"/>specification</a>.</p>
 * <!-- end-model-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.apitest.domain.DomainPackage#getEpisodeObservation()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EpisodeObservation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Observation toCDAType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CD getCode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHOULD</b> contain exactly one [1..1] <tt><b>code</b></tt><tt><b>/@code</b>="ASSERTION" </tt> (CodeSystem:<tt> 2.16.840.1.113883.5.4 HL7ActCode</tt>) (CONF-174)</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EpisodeObservation setCode(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	CD getValue();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p><b>SHOULD</b> contain exactly one [1..1] <tt><b>value</b></tt><tt><b>/@code</b>="404684003" </tt><i>Clinical finding</i> (CodeSystem:<tt> 2.16.840.1.113883.6.96 SNOMEDCT</tt>), where its data type is CD (CONF-175)</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false" valueRequired="true" valueOrdered="false"
	 * @generated
	 */
	EpisodeObservation setValue(CD value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EpisodeObservation init();
} // EpisodeObservation
