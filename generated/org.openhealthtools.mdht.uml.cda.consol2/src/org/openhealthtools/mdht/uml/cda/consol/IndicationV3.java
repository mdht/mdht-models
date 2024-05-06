/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indication V3</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getIndicationV3()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='Indication2TemplateId' templateId.root='2.16.840.1.113883.10.20.22.4.19' templateId.extension='2023-05-01' constraints.validation.info='IndicationValue IndicationValueP' constraints.validation.dependOn.IndicationValue='IndicationValueP'"
 *        annotation="duplicates"
 * @generated
 */
public interface IndicationV3 extends Indication2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicationV3 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicationV3 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // IndicationV3
