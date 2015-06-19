/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Severity Observation2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getSeverityObservation2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='SeverityObservationTemplateId SeverityObservationCode SeverityObservationCodeP SeverityObservationText SeverityObservationStatusCode SeverityObservationStatusCodeP' templateId.root='2.16.840.1.113883.10.20.22.4.8' templateId.extension='2014-06-09' constraints.validation.info='SeverityObservationTextReference SeverityObservationTextReferenceValue SeverityObservationReferenceValue' code.code='SEV' code.codeSystem='2.16.840.1.113883.5.4' code.codeSystemName='HL7ActCode' code.displayName='Severity' constraints.validation.dependOn.SeverityObservationCode='SeverityObservationCodeP' statusCode.code='completed' constraints.validation.dependOn.SeverityObservationStatusCode='SeverityObservationStatusCodeP'"
 * @generated
 */
public interface SeverityObservation2 extends SeverityObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SeverityObservation2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // SeverityObservation2
